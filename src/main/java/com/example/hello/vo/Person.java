package com.example.hello.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
@Component//把配置文件里的信息注入进来
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private String sex;
    private int age;
    private String[] hobby;
    private Map<String,String> score;

    public Person(String name, String sex, int age, String[] hobby, Map<String, String> score) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;
        this.score = score;
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Person(){

    }

    public Map<String, String> getScore() {
        return score;
    }

    public void setScore(Map<String, String> score) {
        this.score = score;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", hobby=" + Arrays.toString(hobby) +
                ", score=" + score +
                '}';
    }
}
