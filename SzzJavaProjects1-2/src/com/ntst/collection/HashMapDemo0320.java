package com.ntst.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map接口———双列集合。键值映射对。键不能重复。
 * 1.Map接口的常用方法；
 * 2.HashMap实现类————键不能重复，键值无序
 * 
 * 案例背景：选拔校运动会运动员。以学号、姓名的方式存储数据。
 */
public class HashMapDemo0320 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		Map hMap = new HashMap();

		//2.添加元素
		hMap.put("001", "hj");
		hMap.put("002", "my");
		hMap.put("003", "zyq");

		hMap.put("001", "hj");//键不能重复
		hMap.put("003", "syb");//按照键，可以修改对应的值

		//遍历
		print(hMap);

		//3.给定键，获取值
		print(hMap.get("002"));

		//4.给定键，删除元素
		hMap.remove("003");
		print(hMap);

		//5.集合长度
		print("集合长度："+hMap.size());

		//6.判断是否为空
		print("集合是空吗？"+hMap.isEmpty());

		//7.是否包含
		print("004在里面吗？"+hMap.containsKey("004"));
		print("my在里面吗？"+hMap.containsValue("my"));

		//8.返回键集合
		Set keys = hMap.keySet();

		//用迭代器遍历集合
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			print(object+":"+hMap.get(object));
		}

		//9.获取集合中的值
		Collection values = hMap.values();

		//用迭代器遍历集合
		it = values.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			print(object);
		}
		//10.获取集合中的键值对
		Set entrySet = hMap.entrySet();

		//用迭代器遍历集合
		it = entrySet.iterator();
		while (it.hasNext()) {
			//键：值
			Map.Entry entry = (Entry) it.next();
			print(entry.getKey()+":"+entry.getValue());
			//从条目中分别获取键和值
		}
	}
}
