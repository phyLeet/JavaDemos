package com.phyleet.proxyPatternDemos.dynamicProxy.jdkDynamic;

public class HelloProxy {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("Java");
    }
}
