package com.annotation.common;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ParamConfigurationProperties.class)
public class PropertiesConfig {
}
