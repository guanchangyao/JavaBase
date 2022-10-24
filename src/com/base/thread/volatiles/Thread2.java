package com.base.thread.volatiles;

public class Thread2 extends Thread{
    @Override
    public void run() {
        while (true){
           synchronized(Money.lock){
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               Money.money=999;
               break;
           }
        }
    }
}
