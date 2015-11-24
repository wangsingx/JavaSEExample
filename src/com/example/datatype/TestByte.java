package com.example.datatype;

/**
 * Created by wangxing on 2015/11/22.
 */
public class TestByte {
    public static void main(String[] args) {
        byte b = 65;

        System.out.println(b);
        System.out.println(Byte.toString(b));

        b = Byte.valueOf("66");
        System.out.println(b);
        // Causes a NumberFormatException since the value is out of range(-128~127)
        //System.out.println(Byte.valueOf("128"));
        //System.out.println(Byte.valueOf("-129"));

        b = -10;
        //get the value stored in a byte as an unsigned integer.
        int x = Byte.toUnsignedInt(b);
        System.out.println(b);
        System.out.println(x);


        Byte bobj = new Byte("92");
        String str = bobj.toString();
        System.out.println(str);


    }
}
