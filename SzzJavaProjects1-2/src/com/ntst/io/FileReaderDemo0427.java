package com.ntst.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 3.字符流
 *   Reader类是字符输入流，用于从某个源设备读取字符。
 *   Writer类是字符输出流，用于向某个目标设备写入字符。
 * 案例：从源文件中读出内容，输出到控制台
 */
public interface FileReaderDemo0427 {

    public static void main(String[] args) throws IOException {
        //1.创建字符输入流对象
        Reader in = new FileReader("src/read.txt");
        int ch;//记录读取的字符
        //读取
        while ((ch = in.read()) != -1) {//判断是否是文件的末尾
            System.out.print((char) ch);//类型强转
        }
        in.close();
    }
}
