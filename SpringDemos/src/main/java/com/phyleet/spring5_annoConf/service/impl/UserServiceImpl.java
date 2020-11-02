package com.phyleet.spring5_annoConf.service.impl;

import com.phyleet.spring5_annoConf.dao.UserDao;
import com.phyleet.spring5_annoConf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public void userAdd() {
        userDao.add();
    }
}
