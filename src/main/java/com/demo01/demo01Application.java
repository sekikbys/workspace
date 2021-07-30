package com.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class demo01Application {

    public static void main(String[] args) {
        SpringApplication.run(demo01Application.class,args);
    }
}
