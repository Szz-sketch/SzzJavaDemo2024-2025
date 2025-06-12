package com.ntst.io;

import java.io.*;

/*
 * 任务：复制文件
 * 要求：将read.txt文件复制，到copy.txt文件中
 *      获取复制文件所消耗的时间
 */
public class FileCopyDemo0427 {
    public static void main(String[] args) throws IOException {
        //1.1创建输入流对象
        Reader in = new FileReader("src/read.txt");
        //1.2创建输出流对象
        Writer out = new FileWriter("src/copy.txt");

        //2.定义开始时间
        long beginTime = System.currentTimeMillis();
        int ch;//记录 字符数组缓冲区的字符个数
        //优化：加字符数组缓冲区
        char[] cbuf = new char[1024];
        //3.读写
        while ((ch = in.read(cbuf)) != -1) {//判断是否是文件的末尾
            out.write(cbuf, 0, ch);//写
        }
        //结束时间的获取
        long endTime = System.currentTimeMillis();
        System.out.println("复制文件所消耗的时间"+(endTime-beginTime));

        //4.关闭流
        in.close();
        out.close();
    }
}
