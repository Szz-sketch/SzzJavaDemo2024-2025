package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务二：布局管理器
 * 在java.awt包中提供了五种布局管理器，分别是FlowLayout（流式布局管理器）、BorderLayout（边界布局管理器）、
 * GridLayout（网格布局管理器）、GridBagLayout（网格包布局管理器）和CardLayout（卡片布局管理器）。
 *
 * 案例：网格包布局管理器setLayout(new GridBagLayout())
 */

public class GridBagLayout0515 extends JFrame {
    //定义构造方法
    public GridBagLayout0515() {
        //设置标题
        super("网格包布局管理器");

        JButton button = new JButton("按钮");

        //设置布局管理器：
        //1)网格包布局管理器
        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        //2)设置网格包约束
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        //3)网格包布局管理器 关联网格包约束
        gridBagLayout.setConstraints(button, constraints);
        //4)将按钮组件添加到窗体容器
        this.add(button);

        //设置位置，大小
        this.setBounds(888, 388, 486, 288);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //测试
        new GridBagLayout0515();
    }
}
