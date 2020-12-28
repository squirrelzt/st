package com.annotation.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "test.new")
public class TestConfiguraionProperties {

    private String oneParam;

    private String twoParam;
}
