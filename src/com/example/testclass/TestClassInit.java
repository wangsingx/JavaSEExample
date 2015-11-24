package com.example.testclass;

/**
 * Created by wangxing on 2015/11/27.
 */
class Test{
    public Test(){
        System.out.println("Test Constructor");
    }
    {
        System.out.println("Init Block 1");
    }
    static {
        System.out.println("Static Init Block 1");
    }
    {
        System.out.println("Init Block 2");
    }
    static {
        System.out.println("Static Init Block 2");
    }

}
public class TestClassInit {
    public static void main(String[] args) {
        Test t;
        t = new Test();
        new Test();
        Class ttest = t.getClass();
        System.out.println(ttest);
    }
}
