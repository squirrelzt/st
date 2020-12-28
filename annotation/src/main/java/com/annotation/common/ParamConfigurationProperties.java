package com.annotation.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "my.param")
public class ParamConfigurationProperties {

    private String oneUrl;

    private String twoUrl;
}
