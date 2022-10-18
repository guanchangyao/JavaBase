package com.base.thread.producer;

public class Cooker extends Thread{
    // 生产者步骤：
    // 1，判断桌子上是否有汉堡包
    // 如果有就等待，如果没有才生产。
    // 2，把汉堡包放在桌子上。
    // 3，叫醒等待的消费者开吃。
    private Desk desk;

    public Cooker(Desk desk) {
        this.desk=desk;
    }

    @Override
    public void run() {
        while (true){
           synchronized (desk.getLock()){
               if(desk.getCount() ==0){
                   //生产达到数量就不生产
                   break;
               }
               if(desk.isFlag()){
                   try {
                       //桌子上存在汉堡 就等待
                       desk.getLock().wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }else {
                   System.out.println("厨师再生产汉堡");
                   //不存在汉堡的情况
                   //把汉堡包放在桌子上。
                   desk.setFlag(true);
                   //叫醒等待的消费者开吃。
                   desk.getLock().notifyAll();
               }
           }
        }
    }
}
