package com.phyleet.messageQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * https://blog.csdn.net/qq_25652949/article/details/90050036
 */
public class Broker {
    private final static int MAX_SIZE = 3;
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    public static void produce(String msg) {
        if (messageQueue.offer(msg)) {
            System.out.println("向队列添加了消息: " + msg);
        } else {
            System.out.println("队列已满.");
        }
    }

    public static String consume() {
        String msg = messageQueue.poll();
        if (msg != null) {
            System.out.println("取出了队列中的消息: " + msg + ", 队列剩余消息数: " + messageQueue.size());
        } else {
            System.out.println("队列是空的.");
        }
        return msg;
    }
}
