package com.team5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.team5.mapper")
public class Project2Team5MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project2Team5MallApplication.class, args);
    }

}
