package com.zlkj.movement.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @Description MyBatis配置类
 * @Author HeZeMin
 * @Date 2020年04月20日 9:31
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zlkj.movement.mapper","com.zlkj.movement.dao"})
public class MyBatisConfig {
}
