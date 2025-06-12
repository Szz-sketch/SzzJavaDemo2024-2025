package com.ntst.collection;
/*
 * Set借口
 * 	HashSet类     TreeSet
 *		| 
 * 	LinkedHashSet类
 * 特点：有序，元素不重复
 */

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo0307 {
	public static void print(Object o) {//输出
		System.out.println(o);
	}
	public static void main(String[] args) {
		//创建集合对象
		HashSet hSet = new HashSet();
		hSet.add("狼山");
		hSet.add("濠河");
		hSet.add("滨江公园");
		hSet.add("野生动物园");
		hSet.add("博物苑");
		//删除
		hSet.remove("滨江公园");
		//查找
		print(hSet.contains("狼山"));
		print(hSet.contains("绿博园"));//可以判断是否存在
		print(hSet.isEmpty());//是否为空
		print("----------------------------");
		hSet.clear();
		print(hSet.isEmpty());
		//修改
		
		//遍历
		print(hSet);
	}
}
