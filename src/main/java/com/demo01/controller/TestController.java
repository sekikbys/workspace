package com.demo01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/GetMapping")
    public String test01() {
        return "GetMapping!";
    }

    @PostMapping("/PostMapping")
    public String test02() {
        return "PostMapping!";
    }

    @DeleteMapping("/DeleteMapping")
    public String test003() {
        return "DeleteMapping!";
    }

    @GetMapping("/login/{user}/{psw}")
    public String test04(@PathVariable String user,@PathVariable String psw) {
        return "login!"+user+" "+psw;
    }

}
