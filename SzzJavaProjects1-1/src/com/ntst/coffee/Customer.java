package com.ntst.coffee;

// 定义一个Customer类，用于表示顾客
public class Customer {
    // 定义顾客的姓名和邮箱
    private String name;
    private String email;
    // 构造函数，用于初始化顾客的姓名和邮箱
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // 获取顾客的姓名
    public String getName() {
        return name;
    }
    // 设置顾客的姓名
    public void setName(String name) {
        this.name = name;
    }
    // 获取顾客的邮箱
    public String getEmail() {
        return email;
    }
    // 设置顾客的邮箱
    public void setEmail(String email) {
        this.email = email;
    }
}
