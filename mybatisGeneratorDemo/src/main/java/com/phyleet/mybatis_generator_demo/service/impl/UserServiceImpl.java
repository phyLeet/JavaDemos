package com.phyleet.mybatis_generator_demo.service.impl;

import com.phyleet.mybatis_generator_demo.mapper.UserMapper;
import com.phyleet.mybatis_generator_demo.pojo.User;
import com.phyleet.mybatis_generator_demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")  //此处使用 @Autowired 报错.
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
