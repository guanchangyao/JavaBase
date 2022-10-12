package com.base.thread.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread运行"+i);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public MyThread(String name) {
        super(name);
    }
}
