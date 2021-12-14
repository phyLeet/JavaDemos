package com.phyleet.threadDemos;

public class HelloStock {
    public static void main(String[] args) {
        new Thread(new Task1(), "线程1").start();
        new Thread(new Task2(), "线程2").start();
    }

}

class Task1 implements Runnable {
    @Override
    public void run() {
        Stock stock = new Stock();
        for (int i = 0; i < 20; ++i) {
            stock.setNumbers(stock.getNumbers() + 1);
            System.out.println(Thread.currentThread().getName() + " --> numbers:" + stock.getNumbers());
        }
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        Stock stock = new Stock();
        for (int i = 0; i < 20; ++i) {
            stock.setNumbers(stock.getNumbers() + 1);
            System.out.println(Thread.currentThread().getName() + " --> numbers:" + stock.getNumbers());
        }
    }
}
