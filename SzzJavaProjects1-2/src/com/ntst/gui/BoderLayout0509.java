package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务二：布局管理器
 * 在java.awt包中提供了五种布局管理器，分别是FlowLayout（流式布局管理器）、BorderLayout（边界布局管理器）、
 * GridLayout（网格布局管理器）、GridBagLayout（网格包布局管理器）和CardLayout（卡片布局管理器）。
 *
 * 案例：边界布局管理器setLayout(new BorderLayout())。
 */

public class BoderLayout0509 extends JFrame {
    //定义构造方法
    public BoderLayout0509() {
        //设置标题
        super("边界布局管理器");

        //设置布局管理器：水平间距5，垂直间距10
        this.setLayout(new BorderLayout(5,10));

        //创建按钮组件
        JButton button1 = new JButton("东面");
        JButton button2 = new JButton("西面");
        JButton button3 = new JButton("南面");
        JButton button4 = new JButton("北面");
        JButton button5 = new JButton("中间");
        JButton button6 = new JButton("下课");

        //将按钮组件添加到窗体容器中
        this.add(button1,BorderLayout.EAST);
        this.add(button2,BorderLayout.WEST);
        this.add(button3,BorderLayout.SOUTH);
        this.add(button4,BorderLayout.NORTH);
        this.add(button5,BorderLayout.CENTER);
        this.add(button6,BorderLayout.CENTER);

        //设置位置，大小
        this.setBounds(880,380,350,250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //测试
        new BoderLayout0509();
    }
}
