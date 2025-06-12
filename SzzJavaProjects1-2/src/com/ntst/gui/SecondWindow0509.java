package com.ntst.gui;

import javax.swing.*;

/*
 * 单元5：图形用户界面GUI
 * 任务一：窗体容器
 *  创建窗体方式2(以后都采用这种方法)：
 */
public class SecondWindow0509 extends JFrame {
    //定义构造方法
    public SecondWindow0509() {
        //设置标题
        super("第二个窗体");
        this.setBounds(550,800,850,600);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        //测试
        new SecondWindow0509();
    }
}
