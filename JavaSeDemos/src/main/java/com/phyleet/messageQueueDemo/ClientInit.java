package com.phyleet.messageQueueDemo;

import java.io.IOException;
import java.util.Scanner;

public class ClientInit {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入1或2选择写入还是取出.");
        System.out.println("1: 写入  2: 取出");
        int in;
        int i = 1;
        while ((in = new Scanner(System.in).nextInt()) != -1) {
            if (in == 1) {
                MqClient.produce("Hello, world.");
                i++;
            } else if (in == 2) {
                String msg = MqClient.consume();
                System.out.println("获取的消息是: " + msg);
            } else {
                System.out.println("请输入正确的选项.");
            }
        }
        System.out.println("请输入1或2选择写入还是取出.");
        System.out.println("1: 写入  2: 取出");
    }
}
