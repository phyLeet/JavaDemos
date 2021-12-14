package com.phyleet.springAOP.annoDemo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    @UseProxy
    public void say(String name) {
        System.out.println(name + ": Hello, world.");
    }
}
