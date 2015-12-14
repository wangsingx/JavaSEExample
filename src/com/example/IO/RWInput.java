package com.example.IO;

/**
 * Created by wangxing on 2015/12/11.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*from   ww w .  j av a  2  s.  c o  m*/
public class RWInput {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = in.readLine();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        out.write(strLine, 0, strLine.length());
        out.flush();
        in.close();
        out.close();
    }
}