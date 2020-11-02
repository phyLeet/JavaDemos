package com.phyleet.proxyPatternDemos.dynamicProxy.cglibDynamic;

public class AliSmsService {
    public String send(String message) {
        System.out.println("send message: " + message);
        return message;
    }
}
