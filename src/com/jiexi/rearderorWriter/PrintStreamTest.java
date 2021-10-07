package com.jiexi.rearderorWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author GOU
 * @Date 2021-10-07 10:46
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
            // printStream = new PrintStream(System.out);
            printStream = new PrintStream(new FileOutputStream("src/resources/123.txt"));
            printStream.write("Hello jiexi\n".getBytes());
            printStream.print(true);
            // 格式输出 %s 字符串 %d 整形
            System.out.printf("%s--%d--%f","abc",123,0.4678);
            printStream.printf("\n%s--%d--%f","abc",123,0.4678);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            printStream.close();
        }
    }
}
