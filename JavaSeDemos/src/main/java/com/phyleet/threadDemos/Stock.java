package com.phyleet.threadDemos;

public class Stock {
    private String name;
    private int numbers;

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}
