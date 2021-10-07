package com.jiexi.rearderorWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 将文本写入字符输出流，缓冲字符，以便有效地写入单个字符，数组和字符串
 * @author GOU
 * @Date 2021-10-06 22:48
 */
public class BufferedWriterTest {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(new File("src/resources/abc.txt"));
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("test jiexi carry");
            bufferedWriter.newLine();
            bufferedWriter.append("杰希的测试代码");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
