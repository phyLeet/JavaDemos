package com.phyleet.proxyPatternDemos.dynamicProxy.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DebugInvocationHandle implements InvocationHandler {
    private final Object target;

    public DebugInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After method " + method.getName());
        return result;
    }
}
