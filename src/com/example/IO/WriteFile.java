package com.example.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by wangxing on 2015/12/12.
 */
public class WriteFile {
    public static void main(String[] args) {
        try{
            String content = "Hello Java IO";
            File file = new File("write.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
