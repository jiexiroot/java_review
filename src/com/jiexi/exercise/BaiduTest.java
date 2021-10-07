package com.jiexi.exercise;

import java.io.*;
import java.net.URL;

/**
 * @author GOU
 * @Date 2021-10-07 10:31
 */
public class BaiduTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        // 打开百度
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.baidu.com").openStream(),"utf-8"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream( "src/resources/baidu.html")));

            String msg = "";
            while ((msg = bufferedReader.readLine())!= null){
                bufferedWriter.write(msg);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
