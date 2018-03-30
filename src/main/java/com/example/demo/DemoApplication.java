package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author zhangyang
 */
@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication {


    public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(DemoApplication.class);
//		//去掉banner
//		app.setBannerMode(Banner.Mode.OFF);
//		app.run(args);
        SpringApplication.run(DemoApplication.class, args);
    }
}
