package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 下午3:31
 * @Version: v1.0
 * ClassName: Sheep
 * Package: com.atguigu.boot.bean
 * Description: 描述
 */
@ConfigurationProperties(prefix="sheep")
public class Sheep {
    private long id;
    private String name;
    private int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        return "Sheep{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
