package com.ntst.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * OutputStream,它是字节流的顶级父类
 * FileOutStream是OutStream的子类，它是操作文件的字节输入流，专门用于读取文件中的数据
 * 任务2.1：FileOutStream的应用
 * 要求:将数据写入src/b.txt
 */
public class FileOutputStream0418{

	public static void main(String[] args) throws IOException {
		//1.创建输出流对象
		OutputStream out = null;
		try {
//			out = new FileOutputStream("src/b.txt");//覆盖方式写入
			out = new FileOutputStream("src/b.txt", true);//追加方式写入
			//2.准备数据
			String str = "\n明天周末放假请我吃饭";
			//转换字符串类型为字节数组
			byte[] b = str.getBytes();
			//3.写入目标文件
			for (int i = 0; i < b.length; i++) {
				out.write(b);
			}
		} finally {
			//4.关闭流，释放资源
			out.close();
		}
	}
}
