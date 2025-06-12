package com.ntst.last; 

public class Circle { // 定义一个名为Circle的公共类
    private double radius; // 定义一个私有变量radius，用于存储圆的半径

    // 构造方法，用于创建Circle对象并初始化radius
    public Circle(double radius) {
        this.radius = radius; // 将传入的radius值赋给当前对象的radius变量
    }

    // 计算圆的面积的方法
    public double area() {
        return Math.PI * radius * radius; // 使用圆的面积公式πr²计算并返回面积
    }

    // 计算圆的周长的方法
    public double circumference() {
        return 2 * Math.PI * radius; // 使用圆的周长公式2πr计算并返回周长
    }

    // 静态方法，用于比较两个圆的半径是否相等
    public static boolean areEqual(double radius1, double radius2) {
        return radius1 == radius2; // 如果两个半径相等，返回true；否则返回false
    }

    // 主方法，程序的入口
    public static void main(String[] args) {
        Circle circle = new Circle(5); // 创建一个半径为5的Circle对象

        // 打印圆的面积
        System.out.printf("面积"+ circle.area());

        // 打印圆的周长
        System.out.printf("周长："+ circle.circumference());

        double anotherRadius = 5; // 定义另一个半径变量，值为5
        // 调用静态方法areEqual比较两个半径是否相等
        boolean isEqual = Circle.areEqual(circle.radius, anotherRadius);
        // 打印比较结果
        System.out.println("是否相等：" + isEqual);
    }
}
/*请创建一个名为 Circle 的类，该类具有以下特性：
一个属性 radius 表示圆的半径。
两个方法 area() 和 circumference() 分别用于计算圆的面积和周长。
一个静态方法 areEqual(double radius1, double radius2) 来判断两个圆是否具有相同的半径，返回值为布尔类型。 */
