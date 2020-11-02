package com.phyleet.spring5_annoConf;

import com.phyleet.spring5_annoConf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.userAdd();
    }
}
