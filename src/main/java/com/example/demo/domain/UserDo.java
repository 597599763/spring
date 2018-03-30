package com.example.demo.domain;

import java.io.Serializable;

/**
 * @author zhangyang
 * @date 2018/1/8
 */
public class UserDo implements Serializable{

    private static final long serialVersionUID = -7488908967791971359L;
    private int Id;
    private String name;
    private int age;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDo{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
