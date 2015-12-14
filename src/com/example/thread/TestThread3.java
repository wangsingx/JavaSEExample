package com.example.thread;

/**
 * Created by wangxing on 2015/12/13.
 */

/**
 * contain shared resource
 */
class Reservior {
    private int total;

    public Reservior(int r) {
        this.total = r;
    }

    /**
     * Thread safe method
     * serialized access to Booth.total
     */
    public synchronized boolean sellTicket() {
        if(this.total > 0) {
            this.total = this.total - 1;
            return true;
        }
        else {
            return false;
        }
    }
}

/**
 * create new thread by inheriting Thread
 */
class Booth extends Thread {
    private static int threadID = 0;

    private Reservior release;
    private int count = 0;
    public Booth(Reservior r) {
        super("ID:" + (++threadID));
        this.release = r;
        this.start();
    }

    public String toString() {
        return super.getName();
    }

    public void run() {
        while(true) {
            if(this.release.sellTicket()) {
                this.count = this.count + 1;
                System.out.println(this.getName() + ": sell 1");
                try {
                    sleep((int) Math.random() * 1000);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                break;
            }
        }
        System.out.println(this.getName() + " sold:" + count);
    }
}

public class TestThread3 {
    public static void main(String[] args) {
        Reservior r = new Reservior(10000);
        Booth th1 = new Booth(r);
        Booth th2 = new Booth(r);
        Booth th3 = new Booth(r);

        th1.run();
        th2.run();
        th3.run();
    }
}
