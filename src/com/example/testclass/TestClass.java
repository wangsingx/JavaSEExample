package com.example.testclass;

/**
 * Created by wangxing on 2015/12/13.
 */

class Human{
    private int height;
}

class Woman extends Human {
    public Human giveBirth(){
        System.out.println("New Human");
        return (new Human());
    }
}

public class TestClass {
    public static void main(String[] args) {
        Human a = new Human();
        Class c1 = a.getClass();
        System.out.println(c1.getName());

        Human b = new Woman();
        Class c2 = b.getClass();
        System.out.println(c2.getName());

        try {
            Class c3 = Class.forName("Human");
            System.out.println(c3.getSimpleName());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Class c4 = String.class;
        System.out.println(c4.getName());

        String s = "abc";
        Class c5 = s.getClass();
        System.out.println(c5.getPackage());
        System.out.println(c5.toString());
    }
}
