package com.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类名称:ResponseBodyController
 * 类描述:@Controller注解和@ResponseBody组合
 * @author squirrel
 * @date 2019-01-21
 */
@Controller
@ResponseBody
@RequestMapping("/controller")
public class ResponseBodyController {

    @RequestMapping("/responsebody")
    public String responsebody() {
        return "@Controller和@ResponseBody组合返回字符串";
    }
}
