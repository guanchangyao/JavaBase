package com.base.thread.producer;

public class Demo {
    public static void main(String[] args) {
        Desk desk=new Desk();
        Cooker cooker=new Cooker(desk);
        Foodie foodie=new Foodie(desk);
        cooker.start();
        foodie.start();
    }
}
