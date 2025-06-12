package com.ntst.last; 

public class FruitTotalWeight { // 定义一个名为FruitTotalWeight的公共类
    public static void main(String[] args) { // 主方法，程序的入口
        int[] weights = {1200, 850, 1100, 900, 1350}; // 定义一个整型数组weights，存储水果的重量
        int totalWeight = 0; // 定义一个整型变量totalWeight，用于存储水果的总重量，初始值为0
        // 使用增强型for循环遍历weights数组
        for (int weight : weights) {
             totalWeight += weight; // 将当前水果的重量累加到totalWeight中
        }
        // 输出水果的总重量
        System.out.println("水果总重量：" + totalWeight + "克"); 
    }
}
/* 
给定一个包含五种水果重量的数组weights，数组内容为：{1200, 850, 1100, 900, 1350}（单位：克）。如果每种水果只有一个，请编写一个Java程序，计算这些水果的总重量，并输出结果。
*/
