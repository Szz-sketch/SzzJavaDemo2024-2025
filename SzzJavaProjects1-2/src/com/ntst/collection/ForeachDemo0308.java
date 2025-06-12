package com.ntst.collection;

import java.util.ArrayList;

/*遍历：
 *  迭代器
 *  foreach循环
 */
public class ForeachDemo0308 {
	public static void print(Object o) {//输出
		System.out.println(o);
	}
	public static void main(String[] args) {
		//创建对象
		ArrayList list = new ArrayList();
		list.add("吃饭");
		list.add("睡觉");
		list.add("爬山");
		list.add(2,"郊游");
		
		for (Object o : list) {
			print(o);
		}
		
		char[] ch = {'c','o','m','e'};
		for (char c : ch) {//foreach循环
			//print(c);
			c = 'a';//修改
		}
		print(ch[0]+" "+ch[1]+" "+ch[2]+" "+ch[3]);
		
		for (int i = 0; i < ch.length; i++) {//普通循环
			ch[i]= 'a';//修改
		}
		print(ch[0]+" "+ch[1]+" "+ch[2]+" "+ch[3]);
	}
}
