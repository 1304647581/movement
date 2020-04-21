package com.zlkj.movement.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Description 用于配置不需要保护的资源路径
 * @Author HeZeMin
 * @Date 2020年04月17日 17:26
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
@EnableConfigurationProperties(IgnoreUrlsConfig.class)
public class IgnoreUrlsConfig {
    /**
     * @Description 安全路径白名单，在spring boot里面注入进来
     * @Author HeZeMin
     * @Date 2020年04月20日 15:35
     */
    private List<String> urls = new ArrayList<>();

}
