package com.base.thread.volatiles;

public class Demo {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        t1.setName("δΈε");
        t1.start();

        Thread2 t2=new Thread2();
        t2.setName("ζι");
        t2.start();
    }
}
