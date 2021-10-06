package com.jiexi.rearderorWriter;

import org.junit.Test;

import java.io.*;

/**
 * 从字符输入流中读取文本并缓冲字符，以便有效地读取字符，数组和行
 * @author GOU
 * @Date 2021-10-06 22:04
 */
public class BufferedReaderTest {
    File f = new File(this.getClass().getResource("/").getPath());

    public static void main(String[] args) {

        // Reader reader = null;
        // try {
        //     reader = new BufferedReader(new FileReader("111.txt"));
        //     int read = reader.read();
        //     System.out.println((char) read);
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }catch (IOException e){
        //     e.printStackTrace();
        // }finally {
        //     try {
        //         reader.close();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        // }



        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/resources/111.txt"));
            // bufferRead 输出一行
            // String read = reader.readLine();
            // System.out.println(read);

            // 循环输出 所有行
            String read = null;
            while ((read = reader.readLine())!=null){
                System.out.println(read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 输出项目地址
     */
    @Test
    public void sy(){
      System.out.println(f);  
    }
}
