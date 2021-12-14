package com.phyleet.springAOP.jdkDynamicProxy.proxy;

import com.phyleet.springAOP.jdkDynamicProxy.toProxy.UserDao;
import com.phyleet.springAOP.jdkDynamicProxy.toProxy.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println(dao.add(2, 3));
        System.out.println(dao.update("update"));
    }
}

class UserDaoProxy implements InvocationHandler {
    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行前: method --> " + method.getName() + ", args -->" + Arrays.toString(args));
        Object res = method.invoke(object, args);
        System.out.println("方法执行之后, " + object);
        return res;
    }
}
