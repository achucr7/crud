package com.achu.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.achu")
public class PostgressApp {

    public static void main(String[] args) {
        SpringApplication.run(PostgressApp.class, args);
    }

}
