package com.cg;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@SpringBootApplication
public class ItemConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemConsumerApplication.class, args);
    }

}
