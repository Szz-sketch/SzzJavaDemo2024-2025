package com.ntst.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 *2.TreeMap类
 *自定义排序 
 */
class Student4{
	private String name;
	private int age;

	public Student4(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student4 [name=" + name + ", age=" + age + "]";
	}

}
public class TreeMapDemo0321_2 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		//通过匿名内部类的方式实现Comparable借口：重写compare()方法
		TreeMap tMap = new TreeMap(new Comparator<Student4>() {

			@Override
			public int compare(Student4 s1, Student4 s2) {
				//按学生姓名进行比较
				int num = s1.getName().compareTo(s2.getName());
				return num == 0 ? num : s1.getAge()-s2.getAge();//先比较年龄，再比较姓名
			}
		});

		//2.添加数据：学生信息-就业去向
		tMap.put(new Student4("张三丰", 23),"北京");
		tMap.put(new Student4("李广平", 21),"上海");
		tMap.put(new Student4("赵吉祥", 22),"南通");
		tMap.put(new Student4("王耀光", 20),"苏州");
		tMap.put(new Student4("陈秀兰", 24),"无锡");
		//3.遍历
		Set keys = tMap.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			print(key+":"+tMap.get(key));
		}


	}

}
