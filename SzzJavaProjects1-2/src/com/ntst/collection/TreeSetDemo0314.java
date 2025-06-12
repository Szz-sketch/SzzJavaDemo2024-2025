package com.ntst.collection;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet排序规则：
 * 	1.自然排序：默认
 * 	2.自定义排序
 * 
 * 案例：自定义Student类，实现Comparable接口，重写compareTo()方法。
 */
class Student2 implements Comparable{

	private String name;
	private int age;

	public Student2(String name,int age) {
		// TODO 自动生成的构造函数存根
		this.name = name;
		this.age = age;
	}

	//重写一下
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return name+":"+age;
	}

	@Override
	public int compareTo(Object obj) {
		// 定义比较的方法，先比较age，再比较name
		Student2 stu = (Student2) obj;
		if (this.age - stu.age > 0) {
			return 1;
		}
		if (this.age - stu.age == 0) {//年龄相同，就比较name
			return this.name.compareTo(stu.name);
		}
		return -1;
	}
}
public class TreeSetDemo0314 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//测试
		//1.创建集合对象
		TreeSet tSet = new TreeSet();
		//2.添加元素
		tSet.add(new Student2("Tom", 20));
		tSet.add(new Student2("Bob", 21));
		tSet.add(new Student2("Lucy", 19));
		tSet.add(new Student2("Tom", 20));
		tSet.add(new Student2("Tim", 19));

		tSet.add(new Student2("沈彦彬", 20));
		tSet.add(new Student2("臧德缘", 21));
		tSet.add(new Student2("马勇", 19));
		tSet.add(new Student2("胡杰", 20));
		tSet.add(new Student2("朱雅琪", 19));

		print(tSet);

		Iterator it = tSet.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			print(object);
		}


	}



}
