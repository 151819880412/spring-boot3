package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: Admin
 * @Create: 2024/9/24 - 上午10:44
 * @Version: v1.0
 * ClassName: Child
 * Package: com.atguigu.boot.bean
 * Description: 描述
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    // 数组
    private List<String> text;
}
