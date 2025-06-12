package com.ntst.marketSystem;

// 定义一个名为Goods的类
public class Goods {

	// 定义一个名为name的私有字符串变量
	private String name;

	// 构造方法，用于初始化name变量
	public Goods(String name) {
		this.name = name;
	}

	// 获取name变量的值
	public String getName() {
		return name;
	}

	// 设置name变量的值
	public void setName(String name) {
		this.name = name;
	}

}
