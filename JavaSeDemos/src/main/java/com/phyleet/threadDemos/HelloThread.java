package com.phyleet.threadDemos;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class HelloThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        MyTask task = new MyTask();
        new Thread(task, "线程1").start();

        MyTask2 task2 = new MyTask2();
        FutureTask<String> myTask2 = new FutureTask<>(task2);
        new Thread(myTask2, "线程2").start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": is running...");
    }
}

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": is running....");
    }
}

class MyTask2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": is running......");
        return "That's ok.";
    }
}
