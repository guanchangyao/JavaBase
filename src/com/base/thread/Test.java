package com.base.thread;

import com.base.thread.callable.MyCallable;
import com.base.thread.runable.MyRunnabel;
import com.base.thread.sellticket.SellTicket;
import com.base.thread.sellticket.SellTicketLock;
import com.base.thread.thread.MyThread;
import com.base.thread.thread.MyThreadSleep;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {

        //createThread();
        //threadName();
        //sleep();
        //syncMethod();
        //lockMethod();
        lockKill();
    }

    private static void  lockKill() {
        //死锁的场景。
        Object objA=new Object();
        Object objB=new Object();
        new Thread(()->{
            while (true){
                synchronized (objA){
                    synchronized (objB){
                        System.out.println("面对疾风吧");
                    }
                }
            }
        }).start();
        new Thread(()->{
            while (true){
                synchronized (objB){
                    synchronized (objA){
                        System.out.println("死亡如风，常伴吾身");
                    }
                }
            }
        }).start();
    }

    private static void lockMethod() {
        //锁的方式同步
        SellTicketLock sk= new SellTicketLock();
        Thread t1=new Thread(sk);
        Thread t2=new Thread(sk);
        t1.setName("窗口一：");
        t2.setName("窗口二：");
        t1.start();
        t2.start();
    }

    private static void syncMethod() {
        //同步代码块
        SellTicket sk=new SellTicket();
        Thread t1=new Thread(sk);
        Thread t2=new Thread(sk);
        t1.setName("窗口一：");
        t2.setName("窗口二：");
        t1.start();
        t2.start();
    }

    private static void sleep() {
        MyThreadSleep sleep=new MyThreadSleep();
        sleep.start();
    }

    private static void threadName() {
        //获取线程的名字
        MyThread thread1=new MyThread("线程ONE");
        MyThread thread2=new MyThread("线程TWO");

//        thread1.setName("线程一");
//        thread2.setName("线程二");

        thread1.start();
        thread2.start();
    }

    /**
     * 线程的创建方式
     * @throws Exception
     */
    private static void createThread() throws Exception{
        extendsClass();
        runnable();
        callable();
    }

    private static void callable() throws InterruptedException, ExecutionException {
        MyCallable callable=new MyCallable();
        FutureTask<String> ft=new FutureTask<>(callable);
        Thread thread = new Thread(ft);
        thread.start();
        String result=ft.get();
        System.out.println("运行结果:"+result);
    }

    private static void runnable() {
        MyRunnabel runnabel=new MyRunnabel();
        Thread thread = new Thread((runnabel));
        thread.start();
    }

    private static void extendsClass() {
        MyThread myThread=new MyThread("");
        myThread.start();
    }
}
