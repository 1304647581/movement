package com.zlkj.movement.security.annotation;

import java.lang.annotation.*;

/**
 *
 * @Description 自定义注解，有该注解的缓存方法会抛出异常
 * @Author HeZeMin
 * @Date 2020年04月17日 17:06
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
