package com.phyleet.spring5_xmlConf.domain;

import java.util.List;

public class Book {
    private String bname;
    private String bauthor;
    private String address;
    private List<String> list;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public String getBname() {
        return bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                ", list=" + list +
                '}';
    }
}
