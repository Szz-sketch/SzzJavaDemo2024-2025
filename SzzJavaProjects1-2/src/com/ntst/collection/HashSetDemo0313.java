package com.ntst.collection;

import java.util.HashSet;

/*
 * Set集合，添加自定义对象
 * 案例：Student类对象，添加到集合
 * 问题：相同学生信息，重复存储
 * 	解决方法：重写hashCode(),equals(o)方法
 */
//定义类
class Student{
	String id;//学号
	String name;

	public Student(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student() {
	}

	public String toString() {
		//输出学号，姓名
		return id + ":"+name;
	}
	//重写hashCode()
	public int hashCode() {
		return id.hashCode();
	}
	
	//equals(o)方法
	public boolean equals(Object obj) {
		//判断是否是一个对象
		if (this == obj) {//如果是同一个对象，就返回true
			return true;
		}
		//判断是否是Student类的对象
		if (!(obj instanceof Student)) {//如果不是，就返回false
			return false;
		}
		
		Student stu = (Student) obj;
		boolean b = this.id.equals(stu.id);//判断学号是否相同
		return b ;
	}
	
}

public class HashSetDemo0313 {
	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		HashSet hSet = new HashSet();
		Student s1 = new Student("001","syb");
		Student s2 = new Student("002","zdy");
		Student s3 = new Student("003","my");
		
		Student s4 = new Student("004","syb");

		hSet.add(s1);
		hSet.add(s2);
		hSet.add(s3);
		hSet.add(s4);
		
		print(hSet);
		
	}


}
