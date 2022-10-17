package com.base.thread.sellticket;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int sellTicket = 100;
    Object obj1=new Object();
    @Override
    public void run() {
        while (true) {

            synchronized (obj1){
              if (sellTicket <= 0) {
                  break;
              } else {
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
                  sellTicket--;
                  System.out.println(Thread.currentThread().getName() + "卖出" + sellTicket);
              }
          }
        }
    }
}
