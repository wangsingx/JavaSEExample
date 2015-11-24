package com.example.datatype;

/**
 * Created by wangxing on 2015/11/22.
 */
public class TestBoolean {
    public static void main(String[] args) {
        Boolean bl = new Boolean(false);
        System.out.println(bl.booleanValue());//false
        bl = new Boolean(true);
        System.out.println(bl.booleanValue());//true

        bl = new Boolean("false");
        System.out.println(bl.toString());//false
        bl = new Boolean("true");
        System.out.println(bl);//true

        bl = Boolean.valueOf("true");
        System.out.println(bl.toString());//true
        bl = Boolean.valueOf("true1");
        System.out.println(bl);//false
    }
}
