package com.example.testclass;

/**
 * Created by wangxing on 2015/11/26.
 */
public class TestOverload {
    public static void func(int a){
        System.out.println("func(int " + a+")");
    }

    public static void func(int a, int b){
        System.out.println("func(int " + a +", int " + b + ")");
    }

    public static void func(double a, double b){
        System.out.println("func(double " + a + ", double " + b+")");
    }

    public static void func(String s){
        System.out.println("func(String " + s + ")");
    }
    public static void main(String[] args) {
        func(1);
        func(1, 2);
        func(1.0, 2);
        func(1, 2.0);
        func("abc");
    }
}
