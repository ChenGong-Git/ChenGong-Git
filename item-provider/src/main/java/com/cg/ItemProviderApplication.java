package com.cg;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@MapperScan("com.cg.dao")
@SpringBootApplication
public class ItemProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemProviderApplication.class, args);
    }

}
