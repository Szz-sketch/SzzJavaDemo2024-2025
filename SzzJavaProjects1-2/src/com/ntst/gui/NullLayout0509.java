package com.ntst.gui;

import javax.swing.*;

/*
 * 单元5：图形用户界面GUI
 * 任务二：布局管理器
 * 在java.awt包中提供了五种布局管理器，分别是FlowLayout（流式布局管理器）、BorderLayout（边界布局管理器）、
 * GridLayout（网格布局管理器）、GridBagLayout（网格包布局管理器）和CardLayout（卡片布局管理器）。
 * 案例：空布局管理器setLayout(null)，完全自由模式
 */
public class NullLayout0509 extends JFrame {
    //定义构造方法
    public NullLayout0509() {
        //设置标题
        super("空布局管理器");

        //设置布局管理器
        this.setLayout(null);

        //创建按钮组件
        JButton button1 = new JButton("按钮1");

        //设置组件位置，大小
        button1.setBounds(200,150,150,140);

        //将按钮组件添加到窗体容器
        this.add(button1);

        //创建button2
        JButton button2 = new JButton("按钮2");
        button2.setBounds(200,300,350,240);
        this.add(button2);

        //设置位置，大小
        this.setBounds(550,800,850,600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //测试
        new NullLayout0509();
    }
}
