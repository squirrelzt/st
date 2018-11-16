package com.squirrel.st.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author squirrelzt
 * @date 2018-11-16
 */
@Slf4j
@RestController
@Api("swagger2.2.8 api test controller")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "hello接口", notes = "基于REST的hello测试接口")
    public String hello() {
        LOGGER.info("controller start ......");
        return "hello world !";
    }
}
