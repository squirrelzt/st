package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author squirrel
 */
@SpringBootApplication
@ComponentScan(value = "com.*")
public class FileApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FileApplicationMain.class).run(args);
    }
}
