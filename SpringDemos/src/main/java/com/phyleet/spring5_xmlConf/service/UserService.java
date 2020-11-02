package com.phyleet.spring5_xmlConf.service;

import com.phyleet.spring5_xmlConf.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("Service add ...");
        userDao.updateUser();
    }
}
