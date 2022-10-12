package com.base.thread.thread;

public class MyThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("睡了"+i);
                Thread.sleep(100);
                System.out.println("醒了"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
