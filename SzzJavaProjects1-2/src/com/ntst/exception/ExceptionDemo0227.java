package com.ntst.exception;

public class ExceptionDemo0227 {
	public static void main(String[] args) {
		try {//可能会出现异常的代码
			System.out.println(8/0);
		} catch (Exception e1) {//捕获异常对象
			// TODO: handle exception
			e1.printStackTrace();
		}
		System.out.println("-------end-------");
		int[]arr = {2,4,8,9,5,8,11};
		try {
			System.out.println(arr[9]);
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		System.out.println("-------end2-------");
	}
}
