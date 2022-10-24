package com.base.thread.volatiles;

public class Thread1 extends Thread{
    @Override
    public void run() {
       while (true){
           synchronized (Money.lock){
               if (Money.money !=10000){
                   System.out.println("不是1W");
                   break;
               }
           }
       }

    }
}
