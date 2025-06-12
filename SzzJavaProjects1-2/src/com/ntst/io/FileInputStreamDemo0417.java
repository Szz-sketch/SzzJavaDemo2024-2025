package com.ntst.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * 二、字节流
 * JDK提供了两个抽象类InputStream和OutputStream，它们是字节流的顶级父类
 * FileInputStream是InputStream的子类，它是操作文件的字节输入流，专门用于读取文件中的数据
 * 任务2：FileInputStream的应用
 */
public class FileInputStreamDemo0417 {

	public static void main(String[] args) throws IOException {
		//1.创建输入流对象
		InputStream in = new FileInputStream("src/a.txt");
		int b = 0;//存储读出的一字节
		while (true) {
			b = in.read();//返回0~255一个整数
			if (b == -1) {//读操作结束，要跳出循环
				break;
			}
			System.out.println(b);	
		}
		in.close();//关闭输入流,释放资源

	}
}
