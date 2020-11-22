package com.example.hello.config;

import com.example.hello.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration//创建对象的
public class MyBeanConfig {

    @Bean
    public Person person(){
        Person p = new Person("kobe","male",42);
        return p;
    }

}
