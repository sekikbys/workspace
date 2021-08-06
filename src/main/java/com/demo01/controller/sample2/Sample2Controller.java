package com.demo01.controller.sample2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample2Controller {

    @GetMapping("/sample2")
    public String sample1(){
        System.out.println("sample2 exec");
        return "sample2_1";
    }
}
