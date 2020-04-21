package com.zlkj.movement.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 *
 * @Description 动态权限相关业务类
 * @Author HeZeMin
 * @Date 2020年04月17日 17:39
 */
public interface DynamicSecurityService {
    /**
     *
     * @Description 加载资源ANT通配符和资源对应MAP
     * @Return: java.util.Map<java.lang.String,org.springframework.security.access.ConfigAttribute>
     * @Author HeZeMin
     * @Date 2020年04月17日 17:39
     */
    Map<String, ConfigAttribute> loadDataSource();
}
