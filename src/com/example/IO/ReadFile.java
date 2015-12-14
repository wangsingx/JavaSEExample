package com.example.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by wangxing on 2015/12/12.
 */
public class ReadFile {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("io.txt"));
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
