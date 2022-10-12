package com.base.thread.runable;

public class MyRunnabel implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable运行"+i);

        }
    }
}
