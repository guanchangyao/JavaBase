package com.base.thread.countDown;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);
        ChileThread1 chileThread1=new ChileThread1(countDownLatch);
        chileThread1.setName("孩子1");
        ChileThread2 chileThread2=new ChileThread2(countDownLatch);
        chileThread2.setName("孩子2");
        ChileThread3 chileThread3=new ChileThread3(countDownLatch);
        chileThread3.setName("孩子3");
        MotherThread motherThread=new MotherThread(countDownLatch);

        motherThread.start();
        chileThread1.start();
        chileThread2.start();
        chileThread3.start();

    }
}
