package com.ntst.test;


public class TestShape {
	public static void main(String[] args) {
//		Square s1 = new Square();
//		s1.side = 6;
		Square s1 = new Square(5);
		
		System.out.println("面积是"+s1.getArea());
		System.out.println("周长是"+s1.getSideLength());
	
		
	}
}
