package com.base.thread.semaphore;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable{
    //1.获取管理员
    private Semaphore semaphore=new Semaphore(2);
    @Override
    public void run() {
        //2.获取通行证
        try {
            semaphore.acquire();
            //3.开始行驶
            System.out.println("开始行驶了");
            Thread.sleep(2000);
            //4.归还通行证
            System.out.println("归还通行证");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
