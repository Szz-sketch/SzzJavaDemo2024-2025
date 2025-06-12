package com.ntst.exception;
/*
  throws关键字： 在方法定义时，声明可能的异常；谁调用，谁处理。
  throw关键字：在方法体中使用，用于抛出一个异常对象；
             throws关键字去声明异常，或try...catch结构处理
 */
public class ExceptionDemo0227_2 {
	public static int divide(int x,int y){
		return x/y;	
	}
	public static int divide2(int x, int y) throws ArithmeticException{
		return x / y ;
	}
	public static void main(String[] args) {
		try {
			System.out.println(divide(8,0));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("捕获的异常信息1："+e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获的异常信息2："+e.getMessage());
		} finally {
			//无论有没有异常，有没有捕获异常，都会执行
			//用于关闭资源
			System.out.println("------finally------");
		}
		try {
			System.out.println(divide2(9, 0));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("-------end-------");
	}
}
