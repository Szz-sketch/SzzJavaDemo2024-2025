package com.ntst.health;

import java.util.Random;

public class Monitor {
	public static void main(String[] args) throws InterruptedException {
		// 定义正常血脂、血糖、血压值
		int nromalXZ = 180;
		int normalXT = 100;
		int normalXY = 120;
		// 创建随机数生成器
		Random random = new Random();
		int xz, xt, xy;
		// 定义是否同时超标标志
		boolean threeLimits = false;
		// 循环监测
		while (!threeLimits) {
			// 生成随机血脂、血糖、血压值
			xz = random.nextInt(200);
			xt = random.nextInt(200);
			xy = random.nextInt(200);

			// 输出监测结果
			System.out.println("血脂：" + xz + "血糖:" + xt + "血压:" + xy);

			// 判断是否同时超标
			if (xz > nromalXZ && xt > normalXT && xy > normalXY) {
				// 输出警告信息
				System.out.println("警告：血糖，血脂，血压同时超标！");
				// 设置超标标志
				threeLimits = true;
			}
			// 暂停100毫秒
			Thread.sleep(100);
		}
		// 输出监测结束信息
		System.out.println("监测结束......");

	}
}
