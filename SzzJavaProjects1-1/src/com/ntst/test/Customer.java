package com.ntst.test;
import java.util.Scanner;

// 定义一个Customer类
public class Customer {
    // 定义一个私有成员变量membershipLevel，表示会员等级
    private String membershipLevel;
    private double totalPrice;

    // 构造方法，初始化会员等级和购物总价
    public Customer(String membershipLevel, double totalPrice) {
        this.membershipLevel = membershipLevel;
        this.totalPrice = totalPrice;
    }

    // 根据会员等级计算折扣率
    public double calculateDiscount() {
        // 定义折扣率
        double discountRate;
        // 判断会员等级
        if (membershipLevel.equals("VIP")) {
            // 如果是VIP会员，折扣率为20%
            discountRate = 0.2; 
        } else if (membershipLevel.equals("Member")) {
            // 如果是普通会员，折扣率为10%
            discountRate = 0.1;
        } else {
            // 如果不是会员，折扣率为0%
            discountRate = 0; 
        }
        // 返回折扣率
        return discountRate;
    }

    // 根据折扣率计算最终支付金额
    public double calculateFinalPrice() {
        double discountRate = calculateDiscount();
        double finalPrice = totalPrice * (1 - discountRate);
        return finalPrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的会员级别（普通/会员/VIP）：");
        String membershipLevel = scanner.nextLine();
        System.out.print("请输入您的购物总价：");
        double totalPrice = scanner.nextDouble();

        // 创建Customer对象
        Customer customer = new Customer(membershipLevel, totalPrice);
        // 计算最终支付金额
        double finalPrice = customer.calculateFinalPrice();

        // 输出最终支付金额
        System.out.printf("您的最终支付金额为：%.2f元", finalPrice);
        scanner.close();
    }
}


