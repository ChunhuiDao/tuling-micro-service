package com.dch.springcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringcodeApplication {
    public static ConfigurableApplicationContext context;
    public static void main(String[] args) {
        SpringcodeApplication.context = SpringApplication.run(SpringcodeApplication.class, args);
    }

}
