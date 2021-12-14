package com.phyleet.springAOP.jdkDynamicProxy.toProxy;

public interface UserDao {
    default int add(int a, int b) {
        System.out.println("add 方法执行了.");
        return a + b;
    }

    default String update(String id) {
        System.out.println("update方法执行了.");
        return id;
    }
}
