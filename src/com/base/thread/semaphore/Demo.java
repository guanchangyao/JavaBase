package com.base.thread.semaphore;

public class Demo {
    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}
