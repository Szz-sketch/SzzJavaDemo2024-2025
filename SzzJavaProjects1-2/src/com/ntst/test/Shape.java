package com.ntst.test;
/*
 * 2025-2-21
 */
public class Shape {
	public double side;
	
	public Shape(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public double getArea() {
		return 0;
	}
	public double getSideLength(){
		return 0;
	}
}
class Square extends Shape{
	public Square(double side) {
		super(side);
	}
	public Square(){
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

	public double getSideLength() {
		// TODO Auto-generated method stub
		return side * 4;
	}
}
class Cicle extends Shape{
	double r;
	
	public Cicle(double r){
		this.r = r;
	}
	public Cicle(){
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return r*r*3.14;
	}
	public double getSideLength() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}
	
}

