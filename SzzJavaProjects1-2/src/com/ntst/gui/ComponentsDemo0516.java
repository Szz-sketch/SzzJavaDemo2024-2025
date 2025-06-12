package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
 * 单元5：图形用户界面GUI
 * 任务三：常用组件的应用
 *
 * 案例：JComboBox 下拉列表框组件 ———— 省份
 *      JRadioButton 单选按钮 ———— 以性别为例
 *      JCheckBox 复选框 ———— 兴趣爱好
 */
public class ComponentsDemo0516 extends JFrame {
    //定义构造方法
    public ComponentsDemo0516() {

        //设置标题
        super("其他常用组件");
        //设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.CENTER,5,10));
        //创建标签
        JLabel label1 = new JLabel("省/直辖市：");
        JLabel label2 = new JLabel("性别：");
        //创建下拉列表框组件
        JComboBox<String> cBox = new JComboBox<>();
        //创建下拉列表项
        cBox.addItem("北京");
        cBox.addItem("上海");
        cBox.addItem("天津");
        cBox.addItem("重庆");
        cBox.addItem("河北");
        cBox.addItem("山西");
        cBox.addItem("江苏");

        //创建JCheckBox 复选框组件
        JCheckBox checkBox1 = new JCheckBox("跑步");
        JCheckBox checkBox2 = new JCheckBox("打篮球");
        JCheckBox checkBox3 = new JCheckBox("骑行");
        JCheckBox checkBox4 = new JCheckBox("游泳");

        //2.JRadioButton 单选按钮
        //2.1创建单选按钮对象————逻辑上的概念
        ButtonGroup group = new ButtonGroup();
        //2.2创建单选按钮对象：互斥
        JRadioButton rbt1 = new JRadioButton("男");
        JRadioButton rbt2 = new JRadioButton("女");
        //2.3将单选按钮对象设置到按钮组对象
        group.add(rbt1);
        group.add(rbt2);
        //将组件添加到窗体
        this.add(label1);
        this.add(cBox);
        this.add(label2);
        //单选按钮对象添加到窗体
        this.add(rbt1);
        this.add(rbt2);

        this.add(new JLabel("兴趣爱好："));
        this.add(checkBox1);
        this.add(checkBox2);
        this.add(checkBox3);
        this.add(checkBox4);
        //设置位置，大小
        this.setBounds(890,380,300,250);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        //测试
        new ComponentsDemo0516();
    }
}
