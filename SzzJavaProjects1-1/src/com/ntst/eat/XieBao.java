package com.ntst.eat;

public class XieBao {

	public static void main(String[] args) {
		// 定义每月工资
		int monthlySalary=100000;
		// 定义蟹黄包价格
		int baoPrice=45;
		// 定义吃蟹黄包总数
		int totalCount=0;
		// 定义剩余存款
		int remainingSalary=0;
		// 将每月工资赋值给剩余存款
		remainingSalary+=monthlySalary;
		// 当剩余存款大于等于蟹黄包价格时，继续循环
		do {
			// 每次吃蟹黄包，剩余存款减去蟹黄包价格
			remainingSalary-=baoPrice;
			// 吃蟹黄包总数加一
			totalCount++;
			// 输出吃蟹黄包的次数
			System.out.println("第"+totalCount+"次吃蟹黄包呀！");
		} while (remainingSalary>=baoPrice);
		// 输出本月吃蟹黄包的总数
		System.out.println("沈彦彬本月吃了"+totalCount+"个美味蟹黄包");
		// 输出剩余存款
		System.out.println("剩余存款"+remainingSalary+"元");
	}
	
}
