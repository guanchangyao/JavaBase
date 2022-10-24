package com.base.thread.executors;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 参数一：核心线程数量
        // 参数二：最大线程数
        // 参数三：空闲线程最大存活时间
        // 参数四：时间单位
        // 参数五：任务队列
        // 参数六：创建线程工厂
        // 参数七：任务的拒绝策略
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.submit(new MyThread());
        threadPoolExecutor.shutdown();
    }
}
