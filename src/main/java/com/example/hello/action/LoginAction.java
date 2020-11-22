package com.example.hello.action;

import com.example.hello.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAction {
    @Autowired
    Person p;

    @RequestMapping("/hello")
    @ResponseBody
    public String login(){
        System.out.println(p.getName());
        return "hello world!..";
    }
}
