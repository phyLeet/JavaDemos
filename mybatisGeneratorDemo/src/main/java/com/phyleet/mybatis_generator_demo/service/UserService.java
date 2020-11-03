package com.phyleet.mybatis_generator_demo.service;

import com.phyleet.mybatis_generator_demo.pojo.User;

public interface UserService {
    User selectByPrimaryKey(Integer id);
}
