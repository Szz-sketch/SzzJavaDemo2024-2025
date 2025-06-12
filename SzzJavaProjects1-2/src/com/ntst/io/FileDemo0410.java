package com.ntst.io;

import java.io.File;

/*
 * 单元4：I/O文件系统
 * 一、File类
 * 1.File类的应用:
 *  对象创建；
 *  常用的方法
 */
public class FileDemo0410 {

	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		//1.创建File对象
		File f1 = new File("D:\\hello.txt");//绝对路径
		File f2 = new File("D:/hello.txt");
		File f3 = new File("src/a.txt");//相对路径(多用这个)
		
		print(f1);
		print(f2);
		
		//2.常用的方法
		print("文件是否存在：" + f1.exists());
		print("文件对象是文件吗：" + f1.isFile());
		print("文件名：" + f1.getName());
		print("文件大小："+f1.length());
		print("文件的绝对路径："+f1.getAbsolutePath());
		
		print("文件的相对路径："+f3.getPath());
		
		//???
		print("文件是目录？"+f1.isDirectory());
		print("f1文件可读吗？"+f1.canRead());
		print("f1文件可写吗？"+f1.canWrite());
		print("f1最后修改时间"+f1.lastModified());
		
		
		
	}

}
