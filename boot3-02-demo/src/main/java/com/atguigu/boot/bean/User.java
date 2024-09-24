package com.atguigu.boot.bean;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 上午10:49
 * @Version: v1.0
 * ClassName: User
 * Package: com.atguigu.boot.Bean
 * Description: 描述
 */
public class User {

    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
