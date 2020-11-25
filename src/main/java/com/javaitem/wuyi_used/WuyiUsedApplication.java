package com.javaitem.wuyi_used;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.javaitem.wuyi_used.dao")
public class WuyiUsedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuyiUsedApplication.class, args);
    }

}
