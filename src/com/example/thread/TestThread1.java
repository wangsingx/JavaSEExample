package com.example.thread;

/**
 * Created by wangxing on 2015/12/13.
 */

class NewThread1 extends Thread{
    private static int threadID = 0;
    public NewThread1() {
        super("ID:" + (++threadID));
    }
    public String toString() {
        return super.getName();
    }
    public void run() {
        System.out.println(this);
    }
}

public class TestThread1 {
    public static void main(String[] args) {
        NewThread1 th1 = new NewThread1();
        NewThread1 th2 = new NewThread1();
        th1.run();
        th2.run();
    }
}
