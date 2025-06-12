package com.ntst.collection;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 2、Collections工具类
 *    可以对List集合进行添加和排序，对Set、List和Map进行查找、替换操作
 */

public class CollectionsDemo0327 {

	public static void out(Object o) {//输出
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1、创建List集合
		ArrayList list = new ArrayList();
		//2、添加元素
		Collections.addAll(list, "c","a","k","e");
		out("初始："+list);
		//3、反转
		Collections.reverse(list);
		out("反转："+list);
		//4、随机打乱
		Collections.shuffle(list);
		out("打乱："+list);
		//5、排序
		Collections.sort(list);
		out("排序："+list);
		//6、交换
		Collections.swap(list, 1, 3);
		out("交换："+list);
		//7、清空
		list.clear();
		out("清空："+list);
		//添加整型数据元素
		Collections.addAll(list, -3,2,9,5,8,6);
		out("初始："+list);
		//7、max
		out("最大值：" + Collections.max(list));
		//8、min
		out("最小值：" + Collections.min(list));
		//9、二分法查找
		//先排序
		Collections.sort(list);
		out("排序后："+list);
		out("二分法查找：" + Collections.binarySearch(list, 8));
		//10、替换
		Collections.replaceAll(list, 2, 44);
		out("替换后："+list);
	}

}
