package com.example.demo10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zq
 * @Date 2022-09-23
 **/
@RestController
public class testController {


    @GetMapping("/getTest")
    public String test(){
        return "hello,w2131orld32131";
    }
}
