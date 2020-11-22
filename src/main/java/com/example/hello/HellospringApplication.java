package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan
//@ImportResource("classpath:bean.xml")
public class HellospringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellospringApplication.class, args);
    }

}
