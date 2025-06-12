package com.ntst.io;

import java.io.*;

/*
 * 任务四：转换流
 * 1.InputStreamReader
 * 2.OutputStreamWriter
 *
 * 案例：从源文件“src/a.txt”，复制到目标文件“src/four.txt”
 * 优化：加入缓冲区，提高读写效率
 */
public class TransDemo0508_2 {
    public static void main(String[] args) throws Exception {
        //1.创建字节输入流对象
        InputStream in = new FileInputStream("src/a.txt");
        //2.创建字节输出流对象
        OutputStream out = new FileOutputStream("src/four.txt");
        //3.创建转换流
        InputStreamReader isr = new InputStreamReader(in);
        OutputStreamWriter osw = new OutputStreamWriter(out);

        //用缓冲区读写文件
        char[] cbuf = new char[1024];

        //4.读写操作
        int ch;//记录缓冲区字符个数
        while((ch = isr.read()) != -1){
            osw.write(cbuf,0,ch);
        }
        //5.关闭流
        isr.close();
        osw.close();
    }
}
