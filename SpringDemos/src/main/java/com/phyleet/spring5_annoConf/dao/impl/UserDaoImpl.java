package com.phyleet.spring5_annoConf.dao.impl;

import com.phyleet.spring5_annoConf.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Hello, user add.");
    }
}
