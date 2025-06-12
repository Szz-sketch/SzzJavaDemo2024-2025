package com.ntst.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 1.List接口的常用子类：LinkedList类的应用
 * 案例背景：学校组织篮球比赛，信息学院也要选队员，组成篮球队。
 * 2.集合遍历。
 */
public class LinkedListDemo0306 {
	
    public static void print(Object o) {//方便输出
        System.out.println(o);
    }
    
	public static void main(String[] args) {
		//1.创建集合对象
		LinkedList llList = new LinkedList();
		llList.add("syb");//添加元素
		llList.add(0, "zdy");
		llList.addLast("my");
		
		llList.offer("hj");
		llList.offerFirst("zyq");
		
		llList.push("LaoWang");
		
		llList.addLast(001);
		
		//获取元素
		print(llList.getFirst()+" "+llList.peekFirst());
		print(llList.getLast()+" "+llList.peekLast());
		print(llList.get(3));
		
		//输出所有元素
		print(llList.toString());//输出的是列表数据样式
		
		//删除元素
		llList.removeFirst();
		print(llList.toString());
		llList.removeLast();
		print(llList.toString());
		
		llList.remove(3);
		print(llList.toString());
		
		llList.pop();
		print(llList.toString());
		llList.pollFirst();
		print(llList.toString());
		
		//一次性添加一组数据元素
		ArrayList list = new ArrayList();
		list.add("HI");
		list.add("IH");
		
		llList.addAll(list);
		print(llList.toString());
		print("--------------1--------------");
		//修改
		llList.set(2, "zl");
		//查找
		print(llList.indexOf("syb"));
		
		//遍历
		//1.数组的方法
		for (int i = 0; i < llList.size(); i++) {
			print(llList.get(i));	
		}
		print("--------------2----------------");
		//2.迭代器
		Iterator it = llList.iterator();//获取迭代器对象
		while (it.hasNext()) {
			String data = (String) it.next();//迭代器对象输出的数据都是object类型
			//在迭代器迭代过程中，使用删除remove()方法，
			if ("zdy".equals(data)) {
	//			llList.remove(data);//删除___有缺陷，会产生异常
				it.remove();//删除
				llList.set(1, "xm");//修改元素
			}
			//print(data);
			print(llList);
		}
		
	}
}
