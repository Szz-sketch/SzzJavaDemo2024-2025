package com.ntst.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 任务：复制文件
 * 要求：将a.txt复制，到c.txt
 * 		获取复制文件所消耗的时间
 * 问题：一个一个字节的读出和写入，文件操作频繁，执行效率很低
 * 		如何改进？————临时缓冲区
 */                       
public class FileCopy0418 {

	public static void main(String[] args) throws IOException {
		//1.创建输入流对象
		InputStream in = null;
		//2.创建输出流对象
		OutputStream out = null;
		try {
			in = new FileInputStream("src/a.txt");
			out = new FileOutputStream("src/c.txt",true);//追加方式写入

			//用缓冲区读写文件
			byte[] buff = new byte[1024];

			int len;//存储缓冲区字节数
			//定义开始时间`
			long beginTime = System.currentTimeMillis();

			//2.读写操作，实现复制文件
			//			while ((len = in.read())!= -1) {
			//				out.write(len);
			//			}
			//改进
			while ((len = in.read(buff))!= -1) {
				out.write(buff, 0, len);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("复制文件所消耗的时间"+(endTime-beginTime));
		} finally {
			in.close();
			out.close();
		}

	}
}
