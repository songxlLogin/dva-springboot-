package com.songxl.springbootdva;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.songxl.springbootdva.dao")
public class SpringbootDvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDvaApplication.class, args);
    }

}
