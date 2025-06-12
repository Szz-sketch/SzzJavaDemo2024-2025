package com.ntst.exception;

public class ThrowDemo0227 {
	//当输入年龄为负数，就抛出异常对象
	public static void printAge(int age) throws Exception {
		if (age <= 0) {
			throw new Exception("输入的年龄有误，必须是正整数！");
		} else {
			System.out.println("此人的年龄为："+ age);
		}
	}
	public static void main(String[] args) {
		//测试
		try {
			printAge(-20);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println("捕获的异常信息："+e.getMessage());
		}
	}
}
