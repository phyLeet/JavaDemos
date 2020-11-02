package com.phyleet.proxyPatternDemos.staticProxy;

public class SmsProxy implements SmsService {
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        System.out.println("Before method send()");
        smsService.send(message);
        System.out.println("After method send()");
        return null;
    }
}
