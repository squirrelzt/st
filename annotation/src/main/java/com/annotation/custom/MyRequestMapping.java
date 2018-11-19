package com.annotation.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.*;

/**
 * @author tom
 * @date 2018-11-19
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
@RequestMapping
public @interface MyRequestMapping {
    @AliasFor(value = "value", annotation = RequestMapping.class)
    String[] myValue() default {};

    @AliasFor(value = "method", annotation = RequestMapping.class)
    RequestMethod[] myMethod() default {};
}
