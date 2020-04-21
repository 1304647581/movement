package com.zlkj.movement.security.component;
import com.zlkj.movement.security.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @Description JWT登录授权过滤器
 * @Author HeZeMin
 * @Date 2020年04月17日 17:15
 */
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(JwtAuthenticationTokenFilter.class);
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        // 获取 request 里面 header 信息
        String authHeader = request.getHeader(this.tokenHeader);
        // 判断获取的 token 字符串是否以 Bearer 为前缀
        if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
            // 截取正确的 token 字符串
            String authToken = authHeader.substring(this.tokenHead.length());
            // 解密 token 字符串，获取用户名
            String username = jwtTokenUtil.getUserNameFromToken(authToken);
            LOGGER.info("checking username:{}", username);
            // 用户名不为空时，在判断 是否在过滤器执行
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                // 根据 token 解析的用户名去 SpringSecurity 获取用户详情
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                // 验证 token 正确性
                if (jwtTokenUtil.validateToken(authToken, userDetails)) {
                    // 封装用户名密码的基石
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    LOGGER.info("authenticated username:{}", username);
                    // set 身份验证信息
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        chain.doFilter(request, response);
    }
}
