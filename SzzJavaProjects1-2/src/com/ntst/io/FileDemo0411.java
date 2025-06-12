package com.ntst.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 单元4：I/O文件系统
 * 一、File类
 * 1.File类的应用:
 *  对象创建；
 *  常用的方法:
 *  
 *  补充：创建临时文件
 * 	重点：目录下文件的遍历方式有三种
 * 		1.遍历指定目录下的所有文件; ——不包括子目录
 * 		2.遍历指定目录下指定拓展名的文件; ——不包括子目录
 * 		3.遍历包括子目录中的文件在内的所有文件.
 */
public class FileDemo0411 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) throws IOException {
		//createTempFile(prefix:文件名前缀, suffix:文件的拓展名)
		File tempFile = File.createTempFile("temp-", "txt");
		tempFile.deleteOnExit();//JVM退出时,会自动调用该方法,也就会删除这个临时文件

		print("是否是文件："+tempFile.isFile());
		print("相对路径："+tempFile.getPath());

		//1.遍历指定目录下的所有文件
		print("---------------------------");
		File f1 = new File("D:/test");
		if (f1.isDirectory()) {
			//判断f1是否是目录
			String[] names = f1.list();
			//数组遍历
			for (String name : names) {
				print(name);
			}	
		}
		//2.遍历指定目录下指定拓展名的文件
		print("---------------------------");
		//①创建文件对象
		File f2 = new File("D:/test/sql");
		//②筛选：创建文件名称的过滤器对象
		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				//难点：实现方法
				File currFile = new File(dir, name);
				//如果文件名以.sql结尾的，则返回true，否则返回false
				if (currFile.isFile() && name.endsWith(".sql")) {//是文件,而且以.sql结尾
					return true;
				} else {
					return false;
				}
			}
		};
		//判断文件对象f2对应的目录是否存在
		if (f2.exists()) {
			String[] lists = f2.list(filter);//过滤器生效
			//数组遍历
			for (String list1 : lists) {
				print(list1);
			}
		}
		//3.遍历包括子目录中的文件在内的所有文件
		print("---------------------------");
		//①创建文件对象
		File f3 = new File("D:/text");
		//递归方法
		fileDir(f3);
	}

	public static void fileDir(File dir) {
		//目录包括子目录的遍历
		File[] files = dir.listFiles();
		//数组遍历
		for (File file : files) {//可能是文件，可能是目录
			if (file.isDirectory()) {//如果是目录，就递归调用
				fileDir(file);
			}
			//否则就是文件,就遍历出来
			print(file.getAbsolutePath());
		}
	}

}
