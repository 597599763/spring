package com.example.demo.domain;

import java.io.Serializable;

/**
 * @author zhangyang
 */
public class Test implements Serializable{

    private static final long serialVersionUID = -2749707180806381044L;
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}