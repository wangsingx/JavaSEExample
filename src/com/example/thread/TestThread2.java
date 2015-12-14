package com.example.thread;

/**
 * Created by wangxing on 2015/12/13.
 */

/**
 * create new thread by implementing Runnable
 */

class NewThread2 implements Runnable {
    public String toString() {
        return Thread.currentThread().getName();
    }

    public void run() {
        System.out.println(this);
    }
}

public class TestThread2 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new NewThread2(), "first");
        Thread th2 = new Thread(new NewThread2(), "second");
        th1.start();
        th2.start();
    }
}
