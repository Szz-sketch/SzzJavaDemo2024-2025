package com.ntst.collection;

import java.util.TreeSet;

/*
 * Set接口
 * 	HashSet类      TreeSet类：平衡二叉树的存储结构，有序，不能有重复元素；
 *                       左子树小于根，右子树大于根节点。
 * 		实例:TreeSet类的应用
 */
public class TreeSetDemo0313 {

	public static void print(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		//1.创建集合对象
		TreeSet tSet = new TreeSet();
		//2.添加元素
		tSet.add(3);
		tSet.add(29);
		tSet.add(101);
		tSet.add(21);
		
		print(tSet);
		

	}
}
