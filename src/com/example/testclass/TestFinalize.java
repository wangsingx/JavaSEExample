package com.example.testclass;

/**
 * Created by wangxing on 2015/11/28.
 */
class Finalize{
    private int x;
    public Finalize(int x){
        this.x = x;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize..." + this.x);
    }
}
public class TestFinalize {
    public static void main(String[] args) {
        for (int i=0;i<2000000;i++){
            new Finalize(i);
        }
    }
}
