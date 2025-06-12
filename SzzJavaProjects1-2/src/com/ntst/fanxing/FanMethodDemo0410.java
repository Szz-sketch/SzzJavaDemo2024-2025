package com.ntst.fanxing;
/*
 * 3.泛型方法：
 * 
 * 定义格式：
 * [访问权限修饰符] [static] [final] <类型形参> 返回值类型 方法名 （形式参数列表）{}
 * 
 * 两种使用方式：
 * 对象名|类名.<类型实参>方法名（类型实参列表）;
 * 对象名|类名.方法名（类型实参列表）.
 */

class Student {
	//静态泛型方法
	public static <T> void name(T t) {
		System.out.println(t + "..." + t.getClass());
	}

	//普通泛型方法
	public <T> void age(T t) {
		System.out.println(t + "---" + t.getClass());
	}
}
//类型通配符？
class Fox <T> {
	private T info;
	
	Fox(T info) {
		this.info = info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public T getInfo() {
		return info;
	}
}

public class FanMethodDemo0410 {

	public static void main(String[] args) {
		//测试
		Student.name(34);
		Student.name("Hello");

		Student stu = new Student();
		stu.name(true);

		new Student().name("wahaha");
		
		//测试方式二
		new Student().age(21);
		new Student().age("周四下午");
		
		//测试类型通配符？
		Fox<?> fox1 = new Fox<String>("九尾狐");
		System.out.println(fox1.getInfo()+"————"+fox1.getInfo().getClass());
		
	}


}
