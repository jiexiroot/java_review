package com.jiexi.exercise;

import java.io.*;

/**
 * @author GOU
 * @Date 2021-10-07 10:21
 */
public class ExitTest2 {
    public static void main(String[] args) {
        // 从控制台读数据 标准输入输出 InputStream  OutStream



        // 第二种方法 try 后面马上更括号 括号中的东西运行完毕后会自动会关闭
        try ( // 字节转字符流
              InputStreamReader inputStreamReader = new InputStreamReader(System.in);
              OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
              BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
              BufferedReader bufferedReader = new BufferedReader(inputStreamReader);){
            String s = "";
            while (!("exit".equals(s))) {
                s = bufferedReader.readLine();
                bufferedWriter.write(s);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
