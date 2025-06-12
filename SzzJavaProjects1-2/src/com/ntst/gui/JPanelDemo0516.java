package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务三：常用组件的应用
 *
 * 案例：JPanel面板组件的使用
 *      ———— 以用户登陆界面为例
 */
public class JPanelDemo0516 extends JFrame {
    //定义构造方法
    public JPanelDemo0516() {

        //设置标题
        super("JPanel面板的使用");
        //1.创建
        //1.1创建三种不同的布局管理器对象
        GridLayout gridLayout = new GridLayout(2, 2,5,5);
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER,10,10);
        BorderLayout borderLayout = new BorderLayout(5,5);
        //1.2创建2个标签组件
        JLabel label1 = new JLabel("用户名：");
        JLabel label2 = new JLabel("密  码：");
        //1.3创建输入文本框组件
        JTextField userName = new JTextField();
        JPasswordField pwd = new JPasswordField();
        //1.4创建 按钮组件
        JButton button1 = new JButton("提交");
        JButton button2 = new JButton("取消");
        //1.5创建Panel容器对象
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        //2.将组件添加到容器
        panel1.add(label1);
        panel1.add(userName);

        panel1.add(label2);
        panel1.add(pwd);

        panel2.add(button1);
        panel2.add(button2);

        //3.各个容器设置 布局管理器
        panel1.setLayout(gridLayout);
        panel2.setLayout(flowLayout);
        this.setLayout(borderLayout);
        //4.panel容器，添加到窗体
        this.add(panel1,BorderLayout.CENTER);
        this.add(panel2,BorderLayout.SOUTH);

        //设置位置，大小
        this.setBounds(890,380,300,250);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        //测试
        new JPanelDemo0516();
    }
}
