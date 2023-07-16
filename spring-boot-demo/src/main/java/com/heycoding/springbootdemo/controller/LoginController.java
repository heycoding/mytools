package com.heycoding.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("login")
public class LoginController {

    @PostMapping
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        return "";
    }
}
