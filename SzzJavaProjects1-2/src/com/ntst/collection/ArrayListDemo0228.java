package com.ntst.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* 
 * 单元二：集合
 * 1.集合的核心体系结构
 * 		单列集合Collection接口、双列集合Map接口
 * 		->>List接口、Set接口
 * 		 ->>ArrayList子类
 */
//1.ArraryList类的应用
public class ArrayListDemo0228 {

	public static void print(Object o) {//输出
		System.out.println(o);
	}

	public static void show(ArrayList list) {
		for(int i = 0;i<list.size();i++) {
			print(list.get(i));
		}
	}
	public static void main(String[] args) {
		//1、创建集合对象
		ArrayList list = new ArrayList();
		list.add("糖醋排骨");//数据元素的添加
		list.add("梅菜扣肉");
		list.add("青菜木耳");
		list.add(2,"番茄炒蛋");//数据元素，添加到指定位置，第i位置

		System.out.println(list.get(2));//数据元素的获取

		list.remove(2);
		System.out.println(list.get(2));

		list.remove("糖醋排骨");
		print(list.get(0));

		list.set(0, "红烧肉");
		print(list.get(0));

		//判断集合是否为空
		System.out.println(list.isEmpty());
		//判断数据对象是否在集合中
		print((list.contains("红烧肉")));
		//遍历
		print("---------------------");
		show(list);
	}
}
