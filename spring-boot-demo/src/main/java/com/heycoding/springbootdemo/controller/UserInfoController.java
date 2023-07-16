package com.heycoding.springbootdemo.controller;

import com.heycoding.springbootdemo.common.domain.vo.Result;
import com.heycoding.springbootdemo.model.UserInfo;
import com.heycoding.springbootdemo.repository.ProductRepository;
import com.heycoding.springbootdemo.repository.UserInfoRepository;
import com.heycoding.springbootdemo.repository.UserInfoRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoRepository repository;
    @Autowired
    private UserInfoRepository2 repository2;
    @Autowired
    private ProductRepository productRepository;


    @GetMapping
    public Result findAllUsers(@RequestParam String name, @RequestParam String pwd) {
        List<UserInfo> all = repository.findAll();
        all = repository2.getUserInfoByName(name, pwd);
        return Result.success(all);
    }

    @PostMapping
    public Result saveUser() {
        UserInfo userInfo =new UserInfo();
        userInfo.setFirstname("chen");
        userInfo.setLastname("yu");
        userInfo.setPassword("chenyu123");
        repository.save(userInfo);
        return Result.success();
    }

    @GetMapping("query")
    public Result query() {
        //productRepository.findAllProductByUserId("1");
//        LocalDate localDate = LocalDate.of(2023, 07, 15);
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
//        Object imm = productRepository.findAllItemByDate(date, "imm");
        productRepository.findOrOrderByUnitPrice();
        return Result.success();
    }

}
