package com.phyleet.proxyPatternDemos.staticProxy;

public class HelloProxy {
    public static void main(String[] args) {
        SmsService smsService = new SmsServiceImpl();
        SmsProxy proxy = new SmsProxy(smsService);
        proxy.send("Hello, proxy.");
    }
}
