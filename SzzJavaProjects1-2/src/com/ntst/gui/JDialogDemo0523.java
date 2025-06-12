package com.ntst.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 任务六：JDialog对话框
 * 1.两种分类：模态对话框，非模态对话框
 * 案例：单击两个按钮，分别打开一个模态对话框，一个非模态对话框
 */
public class JDialogDemo0523 extends JFrame {

    int count = 0;//存放累计结果
    JLabel label2;

    public JDialogDemo0523() {
        super("JDialog对话框");
        //窗体布局
        this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        //创建标签和按钮组件
        JLabel label = new JLabel("......");
        JButton bt1 = new JButton("打开模态对话框");
        JButton bt2 = new JButton("打开非模态对话框");
        JButton bt3 = new JButton("关闭对话框");
        //重点、难点：对话框的使用
        JDialog dialog = new JDialog(this, "第一个对话框");
        //对话框的设置：位置、大小、可见性
        dialog.setBounds(910, 500, 300, 250);
        dialog.setVisible(true);
        //将bt3按钮、lable标签 添加到对话框中
        dialog.add(bt3);
        dialog.add(label);
        dialog.setLayout(new FlowLayout());

        //首先 给组件绑定动作监听器
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //做什么？怎么做？
                //点击按钮，打开模态对话框
                dialog.setModal(true);
                label.setText("当前是模态对话框，不能操作其他窗体");
                dialog.setVisible(true);
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //做什么？怎么做？
                //点击按钮，打开非模态对话框
                dialog.setModal(false);
                label.setText("当前是非模态对话框，可以操作其他窗体");
                dialog.setVisible(true);
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //做什么？怎么做？
                //点击按钮，关闭对话框
                dialog.dispose();
            }
        });
        //将组件添加到窗体
        this.add(bt1);
        this.add(bt2);

        this.setBounds(910, 500, 300, 250);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        //测试
        new JDialogDemo0523();
    }
}
