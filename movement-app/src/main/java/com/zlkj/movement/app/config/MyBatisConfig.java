package com.zlkj.movement.app.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @Description MyBatis配置类
 * @Author HeZeMin
 * @Date 2020年04月17日 16:00
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.zlkj.movement.mapper","com.zlkj.movement.app.dao"})
public class MyBatisConfig {
}
