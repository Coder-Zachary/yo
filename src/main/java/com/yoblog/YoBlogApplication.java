package com.yoblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yoblog.mapper")
public class YoBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoBlogApplication.class, args);
    }

}
