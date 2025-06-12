package com.ntst.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 任务五：事件处理
 * 1.事件处理要素：事件源、事件对象、监听器、事件处理器
 * 2.工作流程：
 *     实现方式：1)实现监听器接口，比如ActionListener接口，并重写actionPerformed()方法
 *             2)继承事件适配器类，比如ActionAdapter类，并重写actionPerformed()方法
 * 案例：单击按钮，在标签显示问候语
 * 拓展：点击第二个按钮，在第二个标签显示单击的次数
 */
public class EventDemo0523 extends JFrame implements ActionListener{

    int count = 0;//存放累计结果
    JLabel label2;

    public EventDemo0523() {
        super("事件处理");
        //布局
        this.setLayout(new GridLayout(2,2,5,5));
        //创建标签和按钮组件
        JLabel label = new JLabel("......");
        JButton button = new JButton("显示问候语");

        label2 = new JLabel("......");
        JButton button2 = new JButton("统计单击次数");
        //重点、难点：事件处理
        //首先 给组件绑定动作监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //做什么？怎么做？
                //点击按钮，在标签显示问候语
                label.setText("Java生日快乐🎂");
            }
        });

        button2.addActionListener(this);

        //将组件添加到窗体
        this.add(label);
        this.add(button);
        this.add(label2);
        this.add(button2);

        //设置位置，大小
        this.setBounds(890, 380, 300, 250);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //做什么？怎么做？
        //点击按钮，在第二个标签显示单击的次数
        count++;
        label2.setText("单击的次数为："+count+"次");
    }
    public static void main(String[] args) {
        //测试
        new EventDemo0523();
    }
}
