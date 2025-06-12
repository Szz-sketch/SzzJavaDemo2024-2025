package com.ntst.eat;

public class MilkTea {
	public static void main(String[] args) {
		// 模拟用户选择
        int teaChoice = 2; // 1: 原味奶茶, 2:榴莲芝士奶绿 , 3: 暴打柠檬茶
        int sweetnessChoice = 2; // 1: 不甜, 2: 微甜, 3: 正常甜
        boolean addPearls = true; // 是否加珍珠
        boolean addJelly = false; // 是否加布丁
        boolean addPudding = true; // 是否加椰果

        // 奶茶类型
        String teaType = "";
        double basePrice = 0.0;

        //根据选择的奶茶类型设置奶茶类型和基础价格
        // 如果用户选择的是原味奶茶
        if (teaChoice == 1) {
            // 将奶茶类型设置为原味奶茶
            teaType = "原味奶茶";
            // 将基础价格设置为15.0元
            basePrice = 15.0;
        } else {
            // 如果用户选择的是榴莲芝士奶绿
            if (teaChoice == 2) {
                // 将奶茶类型设置为榴莲芝士奶绿
                teaType = "榴莲芝士奶绿 ";
                // 将基础价格设置为18.0元
                basePrice = 18.0;
            } else {
                // 如果用户选择的是椰果奶茶
                // 将奶茶类型设置为椰果奶茶
                teaType = "椰果奶茶";
                // 将基础价格设置为20.0元
                basePrice = 20.0;
            }
        }

        // 甜度
        String sweetness = "";

        // 根据选择的甜度设置甜度
        if (sweetnessChoice == 1) {
            sweetness = "不甜";
        } else {
            if (sweetnessChoice == 2) {
                sweetness = "微甜";
            } else {
                sweetness = "正常甜";
            }
        }

        // 小料价格
      // 如果addPearls为true，则pearlsPrice为2.0，否则为0.0
        double pearlsPrice = addPearls ? 2.0 : 0.0;
      // 如果addJelly为true，则jellyPrice为1.5，否则为0.0
        double jellyPrice = addJelly ? 1.5 : 0.0;
      // 如果addPudding为true，则puddingPrice为1.0，否则为0.0
        double puddingPrice = addPudding ? 1.0 : 0.0;

        // 计算总价
        double totalPrice = basePrice + pearlsPrice + jellyPrice + puddingPrice;

        // 输出订单信息
        System.out.println("您的订单:");
        System.out.println("奶茶类型: " + teaType);
        System.out.println("甜度: " + sweetness);
        System.out.println("加珍珠: " + (addPearls ? "是" : "否"));
        System.out.println("加布丁: " + (addJelly ? "是" : "否"));
        System.out.println("加椰果: " + (addPudding ? "是" : "否"));
        System.out.println("总价: " + totalPrice + "元");
	}
}
