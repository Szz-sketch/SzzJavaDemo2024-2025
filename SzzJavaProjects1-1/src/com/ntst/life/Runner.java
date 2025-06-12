package com.ntst.life;

public class Runner {
	// 主方法
	public static void main(String[] args) {
		// 初始化体重
		double initweight = 90.0;
		// 每次跑步消耗的脂肪比例
		double fatBurn = 0.05;
		// 跑步次数
		int runCount = 20;

		// 总消耗的脂肪
		double totalFatBurn = 0.00;
		// 循环跑步次数
		for (int i = 1; i <= runCount; i++) {
			// 每次跑步消耗的脂肪
			totalFatBurn += fatBurn;
			// 输出每次跑步之后消耗的脂肪
			System.out.println("第" + i + "次跑步之后，总消耗了" + totalFatBurn + "kg脂肪");

		}
		// 计算最终体重
		double finalWeight = initweight - totalFatBurn;
		// 输出最终体重
		System.out.println("老王的最终体重:" + finalWeight);
		// 输出任务一完成者
		System.out.println("任务一  沈彦彬");

		// 每次夜宵增加的脂肪
		int eatCounts = 11;
		double fatAdd =0.1;

		// 输出夜宵开始
		System.out.println("~~~~~~~~~~~~~~~~夜宵开始~~~~~~~~~~~~~~~~·");

		// 总增加的脂肪
		double totalFatAdd = 0.0;
		// 循环夜宵次数
		for (int i = 0; i <= eatCounts; i++) {
			// 每次夜宵增加的脂肪
			totalFatAdd += fatAdd;
			// 输出每次夜宵之后增加的脂肪
			System.out.println("第"+i+"次夜宵，总增加脂肪"+totalFatAdd);
		}
		// 计算最终体重
		finalWeight = finalWeight + totalFatAdd;
		// 输出最终体重
		System.out.println("经过"+eatCounts+"次夜宵后，老王最终体重："+finalWeight);
		// 输出任务二完成者
		System.out.println("任务二 沈彦彬");
	}
}