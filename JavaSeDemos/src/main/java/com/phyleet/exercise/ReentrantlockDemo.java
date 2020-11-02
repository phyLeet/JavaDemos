package com.phyleet.exercise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantlockDemo {
    public static void main(String[] args) {
        MyService myService = new MyService();
        new Thread(new MyThread(myService), "线程1").start();
        new Thread(new MyThread(myService), "线程2").start();
        new Thread(new MyThread(myService), "线程3").start();
        new Thread(new MyThread(myService), "线程4").start();
    }
}

class MyService {
    private Lock lock = new ReentrantLock();

    public void service() {
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -- " + (i + 1));
        }
        lock.unlock();
    }
}

class MyThread implements Runnable {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.service();
    }
}