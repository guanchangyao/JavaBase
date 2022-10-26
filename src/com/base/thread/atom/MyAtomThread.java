package com.base.thread.atom;

public class MyAtomThread extends Thread{
    private  volatile  int count=0;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
    }
}
