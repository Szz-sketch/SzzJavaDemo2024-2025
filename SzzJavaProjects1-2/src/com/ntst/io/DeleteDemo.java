package com.ntst.io;

import java.io.File;

/*
 * 单元4：I/O文件系统
 * 一、File类
 * 	任务：删除文件及目录
 */
public class DeleteDemo {

	public static void main(String[] args) {
		//1.创建File对象
		File file = new File("D:/text");
//		if (file.exists()) {
//			System.out.println(file.delete());
//		}//有子目录及文件,删除失败

		//如何删除？
		//递归思想:自定义方法
		deleteDir(file);
		System.out.println("删除成功！");
	}

	public static void deleteDir(File file) {

		if (file.exists()) {
			File[] files = file.listFiles();//得到file数组
			for (File f : files) {
				if (f.isDirectory()) {//如果是目录，递归调用
					deleteDir(f);				
				}else {
					//是文件,就删除
					f.delete();
				}
			}
		}//删除其子目录及文件
		//最后，需要删除此目录
		file.delete();
	}
}