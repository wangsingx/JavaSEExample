package com.example.testclass;

/**
 * Created by wangxing on 2015/11/29.
 */
public class TestException {
    public static void main(String[] args) {
        int x = 10, y = 0, z;
        try {
            z = x / y;
            System.out.println("z = " + z);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("End");
    }
}
