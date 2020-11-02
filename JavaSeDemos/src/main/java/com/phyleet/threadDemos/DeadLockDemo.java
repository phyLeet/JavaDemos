package com.phyleet.threadDemos;

public class DeadLockDemo {
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + " get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting for resource2");
                // synchronized (resource2) {
                //     System.out.println(Thread.currentThread() + " get resource2");
                // }
                //    注意此段代码放在锁内和锁外的区别. 只有放在锁内才会导致死锁.
            }
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + " get resource2");
            }
        }, "线程1").start();

        new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread() + " get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + " waiting for resource2");
                // synchronized (resource1) {
                //     System.out.println(Thread.currentThread() + " get resource2");
                // }
            }
            synchronized (resource1) {
                System.out.println(Thread.currentThread() + " get resource2");
            }
        }, "线程2").start();
    }
}
