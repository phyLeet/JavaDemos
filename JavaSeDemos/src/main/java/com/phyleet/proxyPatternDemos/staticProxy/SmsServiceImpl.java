package com.phyleet.proxyPatternDemos.staticProxy;

public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("Send message: " + message);
        return message;
    }
}
