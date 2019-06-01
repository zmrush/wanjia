package com.wanjia.zhensuo.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wanjia.zhensuo.admin.mapper")
public class BootApplication {

    public static void main(String[] args){
        SpringApplication springBootApplication=new SpringApplication(BootApplication.class);
        springBootApplication.run(args);
    }
} 