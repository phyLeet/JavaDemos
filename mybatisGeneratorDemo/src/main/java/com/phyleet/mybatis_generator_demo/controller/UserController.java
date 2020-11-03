package com.phyleet.mybatis_generator_demo.controller;

import com.phyleet.mybatis_generator_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("index")
    public String index() {
        return userService.selectByPrimaryKey(1).toString();
    }
}
