package com.example.testclass;

/**
 * Created by wangxing on 2015/11/25.
 */
public class TestClass1 {
    byte b;//w  w  w . jav a  2s. com
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
    String str;

    public static void main(String[] args) {
        TestClass1 obj = new TestClass1();

        System.out.println("byte is initialized to " + obj.l);
        System.out.println("short is initialized to " + obj.s);
        System.out.println("int is initialized to " + obj.i);
        System.out.println("long is initialized to " + obj.l);
        System.out.println("float is initialized to " + obj.f);
        System.out.println("double is initialized to " + obj.d);
        System.out.println("boolean is initialized to " + obj.bool);
        System.out.println("String is initialized to " + obj.str);
    }
}
