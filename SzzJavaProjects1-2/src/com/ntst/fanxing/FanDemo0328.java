package com.ntst.fanxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 2.泛型
 * 	 作用：提高数据的安全性；
 * 		  消除类型强转；
 * 		  复用性；
 *       运行效率。
 *	 格式：<类型参数>
 */
public class FanDemo0328 {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		//1.创建集合
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		/* list.add("3");编译错误*/
		 
		for (int i = 0; i < list.size(); i++) {
		  /*Integer num =(Integer) list.get(i);*/
			Integer num = list.get(i);
		}
		print(list);
		
		//2.Set集合
		Set<String> hSet = new HashSet<String>();
	  /*hSet.add(90);*/
		hSet.add("90");
		
		//3.Map集合:学生姓名 年龄
		Map<String,Integer> hMap = new HashMap<String,Integer>();
		hMap.put("张三", 19);
		hMap.put("李四", 20);
		hMap.put("王五", 21);
		
		Set names = hMap.keySet();
		
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			Integer age = hMap.get(name);
			print(name+":"+ age );
		}
		
	}
}
