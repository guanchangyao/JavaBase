package com.base.thread.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable{
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyCallable运行"+i);
        }
        return "运行完了";
    }
}
