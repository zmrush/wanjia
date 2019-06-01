package com.wanjia.zhensuo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args){
        SpringApplication springBootApplication=new SpringApplication(BootApplication.class);
        springBootApplication.run(args);
    }
} 