package com.squirrel.st.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author squirrelzt
 * @date 2018-11-16
 */
@Slf4j
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("controller start ......");
        return "hello world !";
    }
}
