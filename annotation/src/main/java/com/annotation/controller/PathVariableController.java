package com.annotation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称:PathVariableController
 * 类描述:PathVariable控制器
 * @author squirrel
 * @date 2019-01-21
 */
@RestController
@RequestMapping("annotation")
public class PathVariableController {

    @RequestMapping("/pathvar/{id}")
    public String pathVar(@PathVariable("id") String pathId) {
        System.out.println(pathId);
        return "PathVariable test";
    }
}
