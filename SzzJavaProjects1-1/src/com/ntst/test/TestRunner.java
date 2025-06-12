package com.ntst.test;

public class TestRunner {
    public static void main(String[] args) {
        // 循环从1到10
        for (int i = 1; i <= 10; i++) { 
           // 如果i等于2或5，则输出提示信息，并跳过本次循环
           if (i==2|i==5) {
            System.out.println("今天是第"+i+"天，老王休息不跑步");
            continue;         
           }
           // 如果i等于9，则输出提示信息，并跳出循环
           if (i==9) {
            System.out.println("今天是第"+i+"天，老王坚持不住了，要放弃");
            break;
           }
           // 输出正常跑步减肥的信息
           System.out.println("今天是第"+i+"天，老王正常跑步减肥");
           
        }   
        // 输出作者姓名
        System.out.println("沈彦彬"); 
    }
}
