package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务三：常用组件的应用
 *
 * 案例：JLable标签组件
 */

public class JLableDemo0515 extends JFrame{
    //定义构造方法
    public JLableDemo0515() {
        //设置标题
        super("JLable标签组件");
        //设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));

        // 创建标签
        JLabel label1 = new JLabel("甄嬛传人物住宅图：");
        JLabel label3Text = new JLabel("123123");

        // 创建图片对象
        ImageIcon icon = new ImageIcon(getClass().getResource("zhenhuan.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("mudan.png"));

        // 标签中包含图片
        JLabel label2 = new JLabel(icon);
        label2.setToolTipText("甄嬛传");

        JLabel label3 = new JLabel(icon2);
        label3.setToolTipText("123123");

        // 将组件添加到窗体
        this.add(label1);
        this.add(label2);
        this.add(label3);

        //设置位置，大小
        this.setBounds(880,380,1000,999);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        //测试
        new JLableDemo0515();
    }
}
