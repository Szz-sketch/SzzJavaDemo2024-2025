package com.ntst.coffee;

public class MenuItem {

    // 声明一个字符串类型的name变量
    private String name;

    // 声明一个double类型的price变量
    private double price;


    // 构造函数，用于初始化name和price变量
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // 获取name变量的值
    public String getName() {
        return name;
    }

    // 设置name变量的值
    public void setName(String name) {
        this.name = name;
    }

    // 获取price变量的值
    public double getPrice() {
        return price;
    }

    // 设置price变量的值
    public void setPrice(double price) {
        this.price = price;
    }

    // 重写toString方法，用于返回MenuItem对象的字符串表示
    @Override
    public String toString() {
        return "MenuItem [name=" + name + ", price=" + price + "]";
    }
    

}
