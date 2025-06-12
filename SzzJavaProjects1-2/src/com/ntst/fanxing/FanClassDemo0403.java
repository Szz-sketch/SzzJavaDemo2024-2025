package com.ntst.fanxing;

import java.util.List;
import java.util.ArrayList;

/*
 * 1.泛型类
 * 	  格式：[访问权限] class 类名<类型形参变量1，类型形参变量2，…，类型形参变量n>{ … }
 * 	  注意：类型形参变量可以用于属性的类型，方法的返回值类型和方法的参数类型。
 * 案例：定义一个商品Goods泛型类
 */
class Goods<T>{
	
	private T info;//类型形参变量可以用于:方法的参数类型
	
	public Goods(T info) {
		this.info = info;
	}
	public T getInfo() {//类型形参变量可以用于:方法的返回值类型
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
}

public class FanClassDemo0403 {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		//测试自定义泛型类Goods
		Goods<Integer> goods = new Goods<Integer>(222);
		print(goods.getInfo()+"......"+goods.getInfo().getClass());
		
		//goods.setInfo("haha");类型是错误的
		
		Goods goods2 = new Goods<Integer>(9999);
		print(goods2.getInfo()+"......"+goods2.getInfo().getClass());
		
		goods2.setInfo("假期");;
		print(goods2.getInfo()+"......"+goods2.getInfo().getClass());
		
		List list = new ArrayList<String>();
		
	}
}
