package com.ntst.last; // 定义包名，用于组织类

public class LibraryFeesCalculator { // 定义一个名为LibraryFeesCalculator的公共类
    public static void main(String[] args) { // 主方法，程序的入口
        int[] fees = {5, 10, 8, 3};  // 定义一个整型数组fees，存储不同类型书籍的借阅费用
        int[] counts = {2, 1, 3, 4};  // 定义一个整型数组counts，存储对应类型书籍的借阅数量
        
        int totalFees = 0; // 初始化总借阅费用为0
        for (int i = 0; i < fees.length; i++) { // 遍历fees数组的每一个元素
            totalFees += fees[i] * counts[i]; // 计算每种类型书籍的借阅费用并累加到总费用中
        }
        
        System.out.println("总借阅费用：" + totalFees); // 输出总借阅费用
    }
}
/*
在一个小型图书馆中，每本书的借阅费用是固定的。现在有四种不同类型的书籍，每种书的借阅费用如下：
小说类：5元/本
科普类：10元/本
文学类：8元/本
儿童读物：3元/本
请编写一个Java程序，给定一个整数数组fees，其中包含上述四类书籍的借阅费用，以及每个类型书籍的借阅数量数组counts，计算并输出这些书籍的总借阅费用。 
*/