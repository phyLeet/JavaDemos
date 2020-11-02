package com.phyleet.proxyPatternDemos.dynamicProxy.cglibDynamic;

public class HelloProxy {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("Java");
    }
}
