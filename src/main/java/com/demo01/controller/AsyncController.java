package com.demo01.controller;

import com.demo01.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/aysnc1")
    public void async1(){
        asyncService.sendMsg("Message:async1");
        return;
    }
}