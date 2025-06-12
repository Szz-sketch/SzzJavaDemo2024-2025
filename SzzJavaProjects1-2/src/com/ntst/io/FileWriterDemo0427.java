package com.ntst.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 3.字符流
 *   Reader类是字符输入流，用于从某个源设备读取字符。
 *   Writer类是字符输出流，用于向某个目标设备写入字符。
 * 案例：将数据写入到目标文件中
 */
public class FileWriterDemo0427 {
    public static void main(String[] args) throws IOException {
        //1.创建字符输出流对象
//        Writer out = new FileWriter("src/write.txt");//覆盖式写入
        Writer out = new FileWriter("src/write.txt", true);//追加式写入
        //2.准备数据
//        String str = "今天是周日，但是我们在补课！把周日还给周末！";
        String str = "\nHello我说，把周日还给周末！！！";
        //3.写入目标文件
        out.write(str);
        //4.关闭流，释放资源
        out.close();
    }
}
