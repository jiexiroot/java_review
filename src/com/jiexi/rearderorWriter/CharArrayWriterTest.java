package com.jiexi.rearderorWriter;

import java.io.CharArrayWriter;

/**
 * @author GOU
 * @Date 2021-10-06 21:52
 */
public class CharArrayWriterTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        charArrayWriter.write(97);
        charArrayWriter.write(98);
        charArrayWriter.write(99);
        System.out.println(charArrayWriter);
        charArrayWriter.close();
    }
}
