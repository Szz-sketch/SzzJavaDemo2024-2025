package com.ntst.collection;

import java.util.Enumeration;
import java.util.Properties;

//1、Properties类
//   Map接口有一个实现类Hashtable，线程安全；存取元素时速度很快。
//   Hashtable类的子类Properties，应用非常广泛
//   Properties主要用于储存字符类型的键和值，在现实开发中，经常使用Properties集合储存应用的配置项。

//   案例：文本编辑工具，要设置背景颜色、字号、语言。将这些配置项存入Properties集合中

public class PropertiesDemo0327 {
	
	public static void out(Object o) {//输出
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1、创建集合对象
		Properties pro = new Properties();
		//2、配置项的添加
		pro.setProperty("Backgroup", "red");
		pro.setProperty("Font-size", "16px");
		pro.setProperty("language", "Chinese");
		out(pro);
		//获取属性名称
		Enumeration names = pro.propertyNames();
		//枚举迭代遍历
		while (names.hasMoreElements()) {
			String key = (String) names.nextElement();
	//		out(key);
			String value = pro.getProperty(key);
			out(key + ":" + value);
		}

	}

}
