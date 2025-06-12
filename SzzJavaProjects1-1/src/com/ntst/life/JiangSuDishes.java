package com.ntst.life;
public class JiangSuDishes {
    public static void main(String[] args) {
        // 定义菜单数组
        String[] menu = {"扬州炒饭","徐州地锅鸡","佛跳墙","奥灶面","无锡酱排骨","江海第一鲜"};
        
        // 定义价格数组
        double[] prices = {35.0, 48.0, 120.0, 28.0, 65.0, 45.0};
        
        // 输出欢迎语
        System.out.println("欢迎光临，老王，这是江苏美食城的招牌菜：");

        // 遍历菜单数组，输出菜名和价格
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]+"--售价"+prices[i]);
        }
        // 定义订单数组
        int[] indices = {1,3,4,5};

        // 输出订单标题
        System.out.println("~~~~~~~~~~您的订单~~~~~~~~~~~~");
        // 定义总价变量
        double total = 0.00;       
        // 遍历订单数组，计算总价并输出订单详情
        for (int index:indices) {
            total +=prices[index];
            System.out.println(menu[index]+"--"+prices[index]);
        }
        // 输出总价
        System.out.println("总价："+total);
        // 输出作者名
        System.out.println("沈彦彬");
    }
}
