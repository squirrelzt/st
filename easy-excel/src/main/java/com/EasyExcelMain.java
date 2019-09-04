package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EasyExcelMain {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EasyExcelMain.class).run(args);
    }
}
