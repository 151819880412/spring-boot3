package com.atguigu.boot.bean;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 上午10:49
 * @Version: v1.0
 * ClassName: Cat
 * Package: com.atguigu.boot.bean
 * Description: 描述
 */
public class Cat {
    long id;
    String name;

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

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
