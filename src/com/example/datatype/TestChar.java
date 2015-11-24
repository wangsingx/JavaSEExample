package com.example.datatype;

/**
 * Created by wangxing on 2015/11/22.
 */
public class TestChar {
    public static void main(String[] args) {
        char symbol = 'a';
        System.out.println(Character.isUpperCase(symbol));
        System.out.println(Character.isLowerCase(symbol));
        System.out.println(Character.isDigit(symbol));
        System.out.println(Character.isLetter(symbol));
        System.out.println(Character.isLetterOrDigit(symbol));
        System.out.println(Character.isWhitespace(symbol));
        System.out.println(Character.isWhitespace('\t'));//' ','\n','\t','\r','\f'

    }
}
