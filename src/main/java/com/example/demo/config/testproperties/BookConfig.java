package com.example.demo.config.testproperties;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangyang
 * @date 2018/1/5
 */
@Configuration
@EnableConfigurationProperties(BookProperties.class)
public class BookConfig {
}
