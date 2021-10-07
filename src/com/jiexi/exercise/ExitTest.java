package com.jiexi.exercise;

import java.io.*;

/**
 * @author GOU
 * @Date 2021-10-07 10:00
 */
public class ExitTest {
    public static void main(String[] args) {


        // 从控制台读数据 标准输入输出 InputStream  OutStream

        // 字节转字符流
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // 第一种方法
        try {
            String s = "";
            while (!("exit".equals(s))) {
                s = bufferedReader.readLine();
                bufferedWriter.write(s);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


