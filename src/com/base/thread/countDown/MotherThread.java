package com.base.thread.countDown;

import java.util.concurrent.CountDownLatch;

public class MotherThread extends Thread{
    private CountDownLatch countDownLatch;
    public MotherThread(CountDownLatch countDownLatch){
        this.countDownLatch=countDownLatch;
    }
    @Override
    public void run() {
        //1.等待
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //2.计数器都走完的时候 开始收盘子
        System.out.println("妈妈在收拾盘子");
    }
}
