package com.base.thread.countDown;

import java.util.concurrent.CountDownLatch;

public class ChileThread3 extends Thread{
    private CountDownLatch countDownLatch=null;
    public ChileThread3(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        //吃饺子
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"在吃饺子"+i+"");
        }
        countDownLatch.countDown();
    }
}
