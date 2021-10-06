package com.jiexi.rearderorWriter;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * @author GOU
 * @Date 2021-10-06 12:39
 */
public class CharArrayReaderTest {
    public static void main(String[] args) {

        char[] chars = "杰希测试".toCharArray();

        CharArrayReader charArrayReader = new CharArrayReader(chars);
        try {
            int read = 0 ;
            while ((read = charArrayReader.read())!=-1)
            {
                System.out.println((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            charArrayReader.close();
        }

    }
}
