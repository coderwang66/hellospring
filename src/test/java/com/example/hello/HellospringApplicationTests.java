package com.example.hello;

import com.example.hello.vo.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.soap.Node;
import java.util.LinkedList;

//@RunWith(SpringRunner.class)
@SpringBootTest
class HellospringApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(1);
//        linkedList.add("dd");
//        linkedList.add(0);
//        linkedList.add(90);
//        for (Object n:linkedList){
//            System.out.println(n);
//        }
    }

}
