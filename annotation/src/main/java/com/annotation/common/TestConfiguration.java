package com.annotation.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public TestConfigurationPropertes1 testConfigurationPropertes1() {
        return new TestConfigurationPropertes1();
    }
}
