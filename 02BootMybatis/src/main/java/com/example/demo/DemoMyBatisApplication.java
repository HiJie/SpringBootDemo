package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class DemoMyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMyBatisApplication.class, args);
    }

}