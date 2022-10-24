package com.base.thread.volatiles;

public class Demo {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.setName("上单");
        t1.start();

        Thread2 t2=new Thread2();
        t2.setName("打野");
        t2.start();
    }
}
