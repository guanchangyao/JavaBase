package com.base.thread.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        //defaultThreads();
        setThreadNumber();
    }

    private static void setThreadNumber() {
        //设置线程池的的最大数量    参数是最大数量 并不是初始数量。
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        newFixedThreadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        newFixedThreadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        newFixedThreadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        newFixedThreadPool.submit(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        });
        newFixedThreadPool.shutdown();
    }

    private static void defaultThreads() {
        //默认开始多线程
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName() + "在执行");
        });
        executorService.shutdown();
    }
}
