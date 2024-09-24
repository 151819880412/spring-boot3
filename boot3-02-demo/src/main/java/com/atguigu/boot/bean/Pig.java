package com.atguigu.boot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 下午2:59
 * @Version: v1.0
 * ClassName: pig
 * Package: com.atguigu.boot.bean
 * Description: 描述
 */
@Component
@ConfigurationProperties(prefix="pig")
public class Pig {
    long id;
    String name;
    int age;

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
        return "pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
