package com.phyleet.spring5_xmlConf;

import com.phyleet.spring5_xmlConf.domain.*;
import com.phyleet.spring5_xmlConf.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test1() {
        // 1. 加载配置文件.
        // BeanFactory == ApplicationContext
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-beans.xml");

        // 2. 获取配置创建的对象.
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println("第四步: 获取bean实例对象.");
        System.out.println(order.getName() + "::" + order.getAddress());
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    @Test
    public void test6() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

    @Test
    public void test7() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Course myBean = context.getBean("myBean", Course.class);
        Course myBean2 = context.getBean("myBean", Course.class);
        System.out.println(myBean);
        System.out.println(myBean.hashCode());
        System.out.println(myBean2);
        System.out.println(myBean2.hashCode());
    }

    @Test
    public void test8() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-auto-beans.xml");
        Object emp = context.getBean("emp");
        System.out.println(emp);
    }
}
