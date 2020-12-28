package com.annotation.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "param.test")
public class TestConfigurationPropertes1 {

    private String one;

    private String two;
}
