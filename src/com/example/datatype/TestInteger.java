package com.example.datatype;

/**
 * Created by wangxing on 2015/11/22.
 */
public class TestInteger {
    public static void main(String[] args) {
        int x = 100000;
        int y = 200000;
        System.out.println(x*y);
        System.out.println(Integer.MIN_VALUE+" and "+Integer.MAX_VALUE);

        System.out.println(Integer.toUnsignedLong(-1));
        System.out.println(Integer.toUnsignedString(-2));
        System.out.println(-1/-2);
        System.out.println(Integer.toBinaryString(100)+"--"+Integer.toOctalString(100)+"--"+Integer.toHexString(100));
        System.out.println(Integer.valueOf(012));
        System.out.println(Integer.valueOf("20", 16));
        System.out.println(Integer.parseInt("20", 16));
        System.out.printf("Hex output: %#x\n", 110);
    }
}
