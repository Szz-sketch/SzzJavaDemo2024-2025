package com.ntst.gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * 单元5：图形用户界面GUI
 * 任务三：常用组件的应用
 * 
 * 案例：	JTable表格
 * 		将表格数据显示到窗体，应用JTable表格
 * 步骤： 1)创建DefaultTableModel对象;
 * 		2)创建JTable表格对象;
 * 		3)创建滑动面板对象JScrollPane;
 * 		4)将JTable表格对象添加到滑动面板对象JScrollPane,否则表头信息无法显示;
 * 		5)滑动面板对象JScrollPane添加到窗体对象;
 * 		6)将表格数据添加到DefaultTableModel对象中.
 * 
 * 表格数据为：学生基本信息
 */
public class JTableDemo0522 extends JFrame {
	
	public JTableDemo0522() {
		super("JTable表格的应用");
		this.setLayout(new BorderLayout(5,5));
		//准备工作一：表头(列的名称)
		Object[] t_head = {"学号","姓名","性别","生源地"};		
		//准备工作二：表中数据
		Object[][] data = {
				{"S001","sss","男","江苏"},
				{"S002","zzz","男","上海"},
				{"S003","yyy","男","中国香港"},
				{"S004","lll","女","贵州"},
				{"S005","vvv","女","广西"},
				{"S006","ccc","女","中国香港"}
		};
		//1)创建DefaultTableModel对象;
		DefaultTableModel model = new DefaultTableModel(t_head,4);
		//2)创建JTable表格对象
		JTable table = new JTable(model);
		//3,4)创建滑动面板对象JScrollPane;将JTable表格对象添加到滑动面板对象JScrollPane
		JScrollPane scrollPane = new JScrollPane(table);
		//5)滑动面板对象JScrollPane添加到窗体对象
		this.add(scrollPane);
		//6)将表格数据添加到DefaultTableModel对象中
		for (int i = 0; i < data.length; i++) {
			model.addRow(data[i]);
		}
		//设置位置，大小
		this.setBounds(890, 380, 300, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		//测试
		new JTableDemo0522();
	}
}
