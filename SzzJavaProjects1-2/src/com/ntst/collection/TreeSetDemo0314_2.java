package com.ntst.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Student3{
	private String id;//学号
	private String name;

	public Student3(String id,String name) {
		this.id = id;
		this.name = name;
	}

	public Student3() {
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		//输出学号，姓名
		return id + ":"+name;
	}
}

public class TreeSetDemo0314_2 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		TreeSet tSet = new TreeSet(new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//重写
				Student3 stu1 = (Student3) o1;
				Student3 stu2 = (Student3) o2;
				//比较规则：先根据Student3的id升序排列，如果id相同，则根据name进行升序排列。
				if (!stu1.getId().equals(stu2.getId())) {
					return stu1.getId().compareTo(stu2.getId());	
				}else {
					return stu1.getName().compareTo(stu2.getName());
				}
			}
		});
		//2.添加元素
		tSet.add(new Student3("2","Tom"));
		tSet.add(new Student3("3","Bob"));
		tSet.add(new Student3("4","Lucy"));
		tSet.add(new Student3("2","Tom"));
		tSet.add(new Student3("6","Tim"));
		tSet.add(new Student3("6","Rose"));
		//3.输出
		print(tSet);
	}
}
