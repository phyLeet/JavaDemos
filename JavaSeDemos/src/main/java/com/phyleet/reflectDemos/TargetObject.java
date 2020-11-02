package com.phyleet.reflectDemos;

public class TargetObject {
    private String value;

    public TargetObject() {
        this.value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s + ".");
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
