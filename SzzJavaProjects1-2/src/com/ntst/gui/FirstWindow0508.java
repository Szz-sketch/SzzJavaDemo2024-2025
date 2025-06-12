package com.ntst.gui;

import javax.swing.*;
import java.awt.*;

/*
  * 单元5：图形用户界面GUI
  * 任务一：窗体容器
  *  AWT包是早期，重量级；Swing包是现代，轻量级，跨平台的。(J开头的类)
  *  Component
  *      |         |      |
  *   Container  Button  Lable
  *      |
  *   Window和Panel(不能单独存在，只能存在其他容器(Window或其子类)中，一个Panel对象代表了一个长方形区域，在这个区域中可以容纳其他组件)
  *       |
  *   Frame类Dialog类
  *   创建窗体方式1：
 */
public class FirstWindow0508 {
    public static void create(){
        //创建窗体方式一：
        Frame frame  = new JFrame("第一个窗体界面");
        //设置位置和大小
        frame.setBounds(500,800,800,600);
        //设置可见
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //测试
        create();
    }
}
