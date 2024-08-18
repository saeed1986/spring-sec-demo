package com.example.spring_sec_demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String greet(HttpServletRequest request){
        return "Hello World " + request.getSession().getId();
    }
    @GetMapping("about")
    public String about(HttpServletRequest request){ // Every time you login you got a different session (session ID)
        return "Telusko " + request.getSession().getId();
    }
}
