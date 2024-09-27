package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Admin
 * @Create: 2024/9/26 - 下午3:32
 * @Version: v1.0
 * ClassName: HelloController
 * Package: com.atguigu.logging.controller
 * Description: 描述
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/q")
    public String hello(String a, String b) {
        // Logger logger = LoggerFactory.getLogger(getClass());
        // logger.info("hello world--------------");
        // log.info("hello world--------------");

        for (int i = 0; i < 1000; i++) {
            log.trace("trace 日志.....");
            log.debug("debug 日志.....");
            // SpringBoot底层默认的日志级别 info
            log.info("info 日志..... 参数a:{} b:{}", a, b);
            log.warn("warn 日志...");
            log.error("error 日志...");
        }
        return "hello";
    }
}
