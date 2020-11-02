package com.phyleet.spring5_xmlConf.domain;

public class Order {
    private String name;
    private String address;

    public Order() {
        System.out.println("第一步: 执行无参数构造器创建对象.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步: 调用set方法设置属性的值.");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void initMethod(){
        System.out.println("第三步: 执行初始化方法.");
    }

    public void destroyMethod(){
        System.out.println("第五步: 执行销毁方法.");
    }
}
