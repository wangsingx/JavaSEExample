package com.example.testclass;

/**
 * Created by wangxing on 2015/11/26.
 */
public class TestVarargs {
    public static void varargs(int... nums){
        for (int num: nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void varargs(int length){
        System.out.println(0 - length);
    }

    public static void main(String... args) {
        varargs(1,2,3,9,8,7);
        varargs(3);
    }
}
