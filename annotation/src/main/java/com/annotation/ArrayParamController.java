package com.annotation;

import com.annotation.vo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称: ArrayParamController
 * 类描述: 数组参数控制器
 * @author squirrel
 * @date 2019-03-01
 */
@RestController
@RequestMapping("/array")
public class ArrayParamController {

    /**
     * 参数是字符串数组
     * @param names 字符串数组名
     * @return 字符串数组
     */
    @RequestMapping("/strings")
    public String[] arrayString(@RequestParam(value = "names") String[] names) {
        System.out.println("----------------------");
        System.out.println(names);
        return names;
    }
}
