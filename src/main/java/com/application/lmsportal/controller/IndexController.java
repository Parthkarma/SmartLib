package com.application.lmsportal.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("/")
    public String listHome(){
        return "index";
    }
}
