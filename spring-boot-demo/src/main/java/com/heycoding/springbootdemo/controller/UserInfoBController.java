package com.heycoding.springbootdemo.controller;

import com.heycoding.springbootdemo.common.domain.vo.Result;
import com.heycoding.springbootdemo.model.UserInfo;
import com.heycoding.springbootdemo.repository.UserInfoRepository;
import com.heycoding.springbootdemo.repository.UserInfoRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoRepository repository;
    @Autowired
    private UserInfoRepository2 repository2;


    @GetMapping
    public Result findAllUsers(@RequestParam String name, @RequestParam String pwd) {
        List<UserInfo> all = repository.findAll();
        all = repository2.getUserInfoByName(name, pwd);
        return Result.success(all);
    }

}
