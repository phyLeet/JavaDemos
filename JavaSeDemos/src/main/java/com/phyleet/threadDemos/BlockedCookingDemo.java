package com.phyleet.threadDemos;

//https://www.cnblogs.com/cz123/p/7693064.html
public class BlockedCookingDemo {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        OnlineShopping shopping = new OnlineShopping();
        shopping.start();
        shopping.join();
        Thread.sleep(2000);
        Shicai shicai = new Shicai();
        System.out.println("第二步: 食材到位.");
        System.out.println("第三步: 开始展现厨艺.");
        cooking(shopping.chuju, shicai);

        System.out.println("总共用时: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    static class OnlineShopping extends Thread {
        private Chuju chuju;

        @Override
        public void run() {
            System.out.println("第一步: 下单.");
            System.out.println("第一步: 等待送货.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("第一步: 快递送到.");
            chuju = new Chuju();
        }
    }

    static class Chuju {
    }

    static class Shicai {
    }

    static void cooking(Chuju chuju, Shicai shicai) {
    }
}
