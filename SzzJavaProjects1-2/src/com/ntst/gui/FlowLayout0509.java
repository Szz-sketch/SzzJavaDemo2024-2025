package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务二：布局管理器
 * 在java.awt包中提供了五种布局管理器，分别是FlowLayout（流式布局管理器）、BorderLayout（边界布局管理器）、
 * GridLayout（网格布局管理器）、GridBagLayout（网格包布局管理器）和CardLayout（卡片布局管理器）。
 *
 * 案例：流式布局管理器setLayout(new FlowLayout())。
 */
public class FlowLayout0509 extends JFrame {
    //定义构造方法
    public FlowLayout0509() {
        //设置标题
        super("流式布局管理器");

        //设置布局管理器：右对齐，水平间距5，垂直间距10
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        //循环方式自动创建按钮组件10个，并添加到窗体
        for (int i = 0; i < 10; i++) {
            this.add(new JButton("按钮" + (i+1)));
        }

        //设置位置，大小
        this.setBounds(550,800,850,600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //测试
        new FlowLayout0509();
    }
}
