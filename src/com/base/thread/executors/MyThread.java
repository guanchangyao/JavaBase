package com.base.thread.executors;

public class MyThread  extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"运行了");
    }
}
