package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Admin
 * @Create: 2024/9/6 - 上午9:56
 * @Version: v1.0
 * ClassName: HellController
 * Package: com.atguigu.boot.controller
 * Description: 描述
 */
@RestController
public class HellController {

    @RequestMapping("/haha")
    public  String hello() {
        return "haha111111111111";
    }
}
