package com.phyleet.spring5_annoConf.service.impl;

import com.phyleet.spring5_annoConf.dao.UserDao;
import com.phyleet.spring5_annoConf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    // @Autowired
    // @Qualifier("userDaoImpl")

    // @Resource  //默认根据类型注入

    /**
     * 注意, Resource是javax包中的注解, 所以不建议使用, 还是用 Autowired 和 Qualifier配置使用最佳.
     */

    //指定根据名称注入
    @Resource(name = "userDaoImpl")
    UserDao userDao;

    // 普通属性注入
    @Value(value = "phyleet")
    private String name;

    @Override
    public void userAdd() {
        System.out.println("Service add..." + ", name is " + name);
        userDao.add();
    }
}
