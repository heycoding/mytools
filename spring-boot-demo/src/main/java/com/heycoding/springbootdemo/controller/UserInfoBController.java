package com.heycoding.springbootdemo.controller;

import com.heycoding.springbootdemo.common.domain.vo.Result;
import com.heycoding.springbootdemo.model.UserInfo;
import com.heycoding.springbootdemo.repository.UserInfoRepository;
import com.heycoding.springbootdemo.repository.UserInfoRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("userinfob")
public class UserInfoBController {

    @Autowired
    private UserInfoRepository repository;
    @Autowired
    private UserInfoRepository2 repository2;


    @GetMapping
    public Result<UserInfo> findAllUsers() {
        UserInfo userInfo = new UserInfo();
        userInfo.setFirstname("Fname");
        if (userInfo != null) {
            return Result.fail("null value");
        }
        return Result.success(userInfo);
    }

}
