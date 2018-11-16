package com.squirrel.st;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class StApplication {

	public static void main(String[] args) {
		LOGGER.error("------------------");
		SpringApplication.run(StApplication.class, args);
	}
}
