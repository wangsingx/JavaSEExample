package com.example.testclass;

/**
 * Created by wangxing on 2015/11/26.
 */

class Phone{
    public String vendor = "iPhone";
    public int year = 2015;
    public int price = 5288;
}

public class TestParameterPass {
    public static void test1(Phone phone){
        System.out.println(phone);
        phone = new Phone();
        System.out.println(phone);
    }

    public static void test2(Phone phone){
        System.out.println(phone.vendor);
        phone.vendor = "iPhone 6s 64GB";
        phone.price = 6088;
        System.out.println(phone.vendor);
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        System.out.println(myPhone);
        System.out.println("---------------------");
        test1(myPhone);
        System.out.println(myPhone);
        System.out.println("---------------------");
        System.out.println(myPhone.vendor);
        test2(myPhone);
        System.out.println((myPhone.vendor));
    }
}
