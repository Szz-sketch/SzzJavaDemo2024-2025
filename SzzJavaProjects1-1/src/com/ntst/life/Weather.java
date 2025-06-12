package com.ntst.life;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		/*
		String weather = "aaa"; // 可以是 "sunny", "cloudy", "rainy", "snowy"
		 * // 根据天气推荐活动
		 * switch (weather) {
		 * case "sunny":
		 * System.out.println("今天天气晴朗，适合户外活动，比如去公园散步或野餐。");
		 * break;
		 * case "cloudy":
		 * System.out.println("今天多云，天气凉爽，可以去爬山或者进行一些轻度的户外运动。");
		 * break;
		 * case "rainy":
		 * System.out.println("今天下雨，建议在家看电影或者读书，享受室内时光。");
		 * break;
		 * case "snowy":
		 * System.out.println("今天下雪，可以去滑雪或者堆雪人，感受冬日的乐趣。");
		 * break;
		 * default:
		 * System.out.println("无法识别的天气条件，请检查输入。");
		 * break;
		 * }
		 */
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入要分类的垃圾...");
		String item = scanner.nextLine();
		System.out.println("您输入的是：" + item);
		switch (item) {
			case "塑料瓶":
			case "易拉罐":
			case "书本":
			case "报纸":
			case "手机":
				System.out.println(item + "属于可回收垃圾");
				break;
			case "电池":
			case "废水":
			case "过期药品":
			case "农药":
			case "医疗废弃物":
				System.out.println(item + "属于有害垃圾");
				break;
			case "鱼骨头":
			case "排骨":
			case "果皮":
			case "烂白菜":
			case "菜叶":
				System.out.println(item + "属于湿垃圾");
				break;
			default:
				System.out.println("抱歉，您自己不是垃圾");

		}

	}
}
