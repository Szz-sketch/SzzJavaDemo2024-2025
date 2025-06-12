package com.ntst.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
 * 1.LinkedHashMap类
 * 	是HashMap的子类，双向链表，使集合元素迭代顺序与存入顺序一致。
 * 2.TreeMap类
 * 	对元素的键可以排序：自然排序和自定义排序。
 */
public class TreeMapDemo0321 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		Map tMap = new TreeMap();
		tMap.put("1","梅花" );
		tMap.put("3","玉兰花" );
		tMap.put("4","海棠花" );
		tMap.put("2","樱花" );

		//2.获取键
		Set keys = tMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			print(key+":"+tMap.get(key));
		}//结论：得到按照键排序的升序序列，这就是自然排序
		
		/*
		 * Set entrySet = tMap.entrySet(); it = entrySet.iterator(); while
		 * (it.hasNext()) { Map.Entry entry = (Entry) it.next();
		 * print(entry.getKey()+":"+entry.getValue()); }
		 */
	}
}
