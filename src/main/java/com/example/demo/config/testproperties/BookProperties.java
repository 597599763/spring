package com.example.demo.config.testproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangyang
 * @date 2018/1/5
 */
@Component
@ConfigurationProperties(prefix = "book")
public class BookProperties {
    /**
     * 名称
     */
    private String name;
    /**
     * 标题
     */
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
