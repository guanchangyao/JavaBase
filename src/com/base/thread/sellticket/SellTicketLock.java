package com.base.thread.sellticket;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicketLock implements Runnable {
    private int sellTicket = 100;
    ReentrantLock  lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
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
            lock.unlock();
        }
    }
}
