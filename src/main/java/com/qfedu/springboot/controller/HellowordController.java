package com.qfedu.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowordController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }




}
