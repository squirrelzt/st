package com.annotation.controller;

import com.annotation.custom.MyRequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tom
 * @date 2018-11-19
 */
@RestController
@MyRequestMapping(myValue = "annotation", myMethod = RequestMethod.GET)
public class AliasForController {

    @MyRequestMapping(myValue = "AliasFor", myMethod = RequestMethod.GET)
    public String myAliasFor() {
        return "this is a @AliasFor annotation";
    }
}
