package com.ntst.exception;

//自定义异常类:除数不能为负数
class DivideByminusException extends Exception{
	
	public DivideByminusException(String message) {
		super(message);
	}
	
	public DivideByminusException() {
		super();
	}
}
public class MyExceptionDemo0227 {

	//定义一个方法，两数相除
	public static int divide(int x,int y) throws DivideByminusException {
		if (y < 0) {
			throw new DivideByminusException("除数是负数");
		}
		return x/y;
	}

	//测试
	public static void main(String[] args) {
		try {
			System.out.println(divide(5, -1));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("捕获的异常信息："+e.getMessage());
		}
	}
}
