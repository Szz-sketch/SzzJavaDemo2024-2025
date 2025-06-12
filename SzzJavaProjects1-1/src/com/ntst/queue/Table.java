package com.ntst.queue; // 定义包名，用于组织类

public class Table { // 定义一个名为Table的公共类
    private int number; // 私有成员变量，表示桌子的编号
    private boolean isOccupied; // 私有成员变量，表示桌子是否被占用

    // 构造方法，用于创建Table对象并初始化number和isOccupied
    public Table(int number, boolean isOccupied) {
        this.number = number; // 初始化桌子的编号
        this.isOccupied = isOccupied; // 初始化桌子的占用状态
    }

    // occupy方法，用于将桌子标记为已占用
    public void occupy() {
        isOccupied = true; // 设置isOccupied为true，表示桌子被占用
        System.out.println("桌号："+number+"--已有顾客落座"); // 输出提示信息，显示桌号和占用状态
    }

    // vacate方法，用于将桌子标记为未占用
    public void vacate() {
        isOccupied = false; // 设置isOccupied为false，表示桌子未被占用
        System.out.println("桌号："+number+"--顾客已离开"); // 输出提示信息，显示桌号和空闲状态
    }
    

    // 获取桌子的编号
    public int getNumber() {
        return number;
    }

    // 设置桌子的编号
    public void setNumber(int number) {
        this.number = number;
    }

    // 获取桌子的占用状态
    public boolean isOccupied() {
        return isOccupied;
    }

    // 设置桌子的占用状态
    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    // 测试代码（可省略）
    public static void main(String[] args) {
        Table table = new Table(1, false); // 创建一个编号为1，未被占用的桌子对象
        table.occupy(); // 调用occupy方法，将桌子标记为已占用
        table.vacate(); // 调用vacate方法，将桌子标记为未占用
    }
}
