package com.example.testclass;

/**
 * Created by wangxing on 2015/11/28.
 */
class CloneTest implements Cloneable{
    private int value;
    public CloneTest(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest test = new CloneTest(100);
        CloneTest tclone = (CloneTest) test.clone();
        System.out.println("Original: " + test.getValue());
        System.out.println("Clone: " + tclone.getValue());

        test.setValue(200);
        tclone.setValue(400);
        System.out.println("Original: " + test.getValue());
        System.out.println("Clone: " + tclone.getValue());
    }

}
