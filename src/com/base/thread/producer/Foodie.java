package com.base.thread.producer;

public class Foodie extends Thread{
    // 1，判断桌子上是否有汉堡包。
    // 2，如果没有就等待。
    // 3，如果有就开吃
    // 4，吃完之后，桌子上的汉堡包就没有了
    // 叫醒等待的生产者继续生产
    private  Desk desk;
    public Foodie(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true){
          synchronized (desk.getLock()){
              if(desk.getCount() ==0){
                  break;
              }
              if(!desk.isFlag()){
                  try {
                      desk.getLock().wait();
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }else{
                  System.out.println("吃货再消费汉堡");
                  desk.setFlag(false);
                  desk.setCount(desk.getCount()-1);
                  desk.getLock().notifyAll();

              }
          }
        }
    }
}
