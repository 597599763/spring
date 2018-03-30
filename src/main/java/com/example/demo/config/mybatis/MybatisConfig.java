package com.example.demo.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyang
 * @date 2018/1/9
 */
@Configuration
@MapperScan(value = "com.example.demo.mapper")
public class MybatisConfig {
}
