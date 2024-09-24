package com.atguigu.boot.config;

import com.alibaba.druid.FastsqlException;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 上午10:50
 * @Version: v1.0
 * ClassName: AppConfig
 * Package: com.atguigu.boot.config
 * Description: 描述
 */

// @Import(FastsqlException.class)     //  给容器中放指定类型的组件,组件的名字默认是全类名
// @Configuration      // 这是一个配置类,@Configur@Configuration
@EnableConfigurationProperties(Sheep.class)
@SpringBootConfiguration
public class AppConfig {

    // 替代以前的 Bean 标签  组件在容器中的名字默认就是方法名
    // 默认单实例
    @Bean(name = "user01")
    @Scope("prototype")     // prototype 多实例模式
    public User user01() {
        var user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

}
