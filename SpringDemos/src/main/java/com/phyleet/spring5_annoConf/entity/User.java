package com.phyleet.spring5_annoConf.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String info;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
