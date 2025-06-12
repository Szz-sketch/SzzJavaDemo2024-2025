package com.ntst.collection;

import java.util.Arrays;

/*
 * 1.Arrays工具类
 *   对数组进行排序、查找元素、复制元素、替换元素
 */

public class ArraysDemo0328 {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void print(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i !=arr.length-1) {
				System.out.print(arr[i]+",");
			} else {
				System.out.println(arr[i]+"]");
			}
		}
	}
	
	public static void main(String[] args) {
		//1.创建数组
		int[] arr = {-3,2,9,8,5,7,};
		//输出
		print("初始：");
		print(arr);
		
		//2.排序
		Arrays.sort(arr);
		print("排序：");
		print(arr);
		
		//3.二分法查找
		int x = Arrays.binarySearch(arr, 8);
		print("查找："+ x );
		
		//4.复制①
		int[] c1 = Arrays.copyOf(arr, 4);
		print("c1数组：");
		print(c1);
		
		//4.复制②
		int[] c2 = Arrays.copyOfRange(arr, 2, 5);
		print("c2数组：");
		print(c2);
		
		//5.替换
		Arrays.fill(arr, 99);//填充式的替换
		print("arr数组替换后：");
		print(arr);
		
	}
	
}
