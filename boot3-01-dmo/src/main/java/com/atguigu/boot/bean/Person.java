package com.atguigu.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: Admin
 * @Create: 2024/9/24 - 上午10:45
 * @Version: v1.0
 * ClassName: Person
 * Package: com.atguigu.boot.bean
 * Description: 描述
 */
@Component
@ConfigurationProperties(prefix = "person") //和配置文件person前缀的所有配置进行绑定
@Data
@NoArgsConstructor //自动生成无参构造器
@AllArgsConstructor //自动生成全参构造器
public class Person {
    private String name;
    private Integer age;
    private Date birthDay;
    private Boolean like;
    // 嵌套对象
    private Child child;
    // 数组(里面是对象)
    private List<Dog> dogs;
    // 表示Map
    private Map<String, Cat> cats;
}
