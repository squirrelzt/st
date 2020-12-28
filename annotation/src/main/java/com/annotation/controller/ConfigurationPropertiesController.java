package com.annotation.controller;

import com.annotation.common.ParamConfigurationProperties;
import com.annotation.common.TestConfiguraionProperties;
import com.annotation.common.TestConfigurationPropertes1;
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
    @Autowired
    TestConfiguraionProperties testConfiguraionProperties;
    @Autowired
    TestConfigurationPropertes1 testConfigurationPropertes1;

    @GetMapping
    public Object getProperties() {
        log.info("one-url={}", paramConfigurationProperties.getOneUrl());
        log.info("two-url={}", paramConfigurationProperties.getTwoUrl());
        log.info("----------------");
        log.info(testConfiguraionProperties.getOneParam());
        log.info(testConfiguraionProperties.getTwoParam());
        log.info("================");
        log.info(testConfigurationPropertes1.getOne());
        log.info(testConfigurationPropertes1.getTwo());
        return paramConfigurationProperties;
    }
}
