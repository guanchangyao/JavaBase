package com.base.thread.producer;

public class Desk {
    private  int  count;
    private boolean flag;
    private final Object lock=new Object();

    public Desk() {
        this(10,false);
    }

    public Desk(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "count=" + count +
                ", flag=" + flag +
                ", object=" + lock +
                '}';
    }
}
