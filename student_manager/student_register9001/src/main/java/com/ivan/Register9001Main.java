package com.ivan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ivan.dao")
public class Register9001Main {
    public static void main(String[] args) {
        SpringApplication.run(Register9001Main.class,args);
    }
}
