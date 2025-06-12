package com.ntst.fanxing;
/*
 * 2.泛型接口
 * 	 格式：[访问权限] interface 接口名称<类型形参变量>{}
 * 	 应用：有两种方式
 * 		方式一：使用非泛型类实现泛型接口
 * 		方式二：使用泛型类实现泛型接口
 * 案例：定义一个Cat泛型接口
 */
//定义一个泛型接口Cat，实现类
//方式一：在泛型接口Cat后，需要指定类型实参，以明确接口的泛型类型
class MyCat implements Cat<String>{

	@Override
	public void show(String t) {
		// TODO 自动生成的方法存根
		System.out.println(t);
	}
	
}
//方式二：使用泛型类 实现 泛型接口
//注意：泛型类和泛型接口，必须要用相同类型形参变量
class YourCat<T> implements Cat<T>{

	@Override
	public void show(T t) {
		// TODO 自动生成的方法存根
		System.out.println(t);
	}
	
}
public class FanInterfaceDemo0403 {
	public static void main(String[] args) {
		//测试方式一
		Cat<String> myCat = new MyCat();
		myCat.show("暹罗猫");
		
		//测试方式二
		Cat<Integer> yourCat = new YourCat();
		yourCat.show(99000);
	}
	
}
