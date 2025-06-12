package com.ntst.gui;

import javax.swing.*;

public class JTextFieldDemo0515 extends JFrame {//创建窗体方式2：

    //定义构造方法
    public JTextFieldDemo0515() {

        //设置标题
        super("JTextField 文本框输入组件");
        //设置布局管理器
        this.setLayout(null);

        //创建标签
        JLabel label1 = new JLabel("请输入用户名：");
        JLabel label2 = new JLabel("请输入密码：");

        JTextField username = new JTextField();
        JPasswordField pwd = new JPasswordField();
        //
        label1.setBounds(30,20,60,30);
        username.setBounds(100,20,130,35);

        label2.setBounds(30,60,60,30);
        pwd.setBounds(100,60,130,35);

        //将组件添加到窗体
        this.add(label1);
        this.add(username);

        this.add(label2);
        this.add(pwd);
        //设置位置，大小
        this.setBounds(890,380,350,300);
        this.setVisible(true);

        //将组件添加到窗体
        this.add(label1);
        this.add(label2);
    }

    public static void main(String[] args) {
        //测试
        new JTextFieldDemo0515();
    }


}
