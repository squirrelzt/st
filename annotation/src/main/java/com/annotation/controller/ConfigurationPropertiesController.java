package com.annotation.controller;

import com.annotation.common.ParamConfigurationProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/properties")
public class ConfigurationPropertiesController {
    @Autowired
    ParamConfigurationProperties paramConfigurationProperties;

    @GetMapping
    public Object getProperties() {
        log.info("one-url={}", paramConfigurationProperties.getOneUrl());
        log.info("two-url={}", paramConfigurationProperties.getTwoUrl());
        return paramConfigurationProperties;
    }
}
