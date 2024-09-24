package com.atguigu.boot;

import com.atguigu.boot.bean.Pig;
import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class Boot302DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Boot302DemoApplication.class, args);
       // for (String beanName : ioc.getBeanDefinitionNames()){
       //     System.out.println("111"+beanName);
       // }
        String[] forType = ioc.getBeanNamesForType(User.class);
        for (String beanName : forType){
            System.out.println("222"+beanName);
        }

        Object user01 = ioc.getBean("user01");
        Object user02 = ioc.getBean("user01");
        System.out.println(user01 == user02);

        Pig pig = ioc.getBean(Pig.class);
        System.out.println(pig);


        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println(sheep);

    }
}
