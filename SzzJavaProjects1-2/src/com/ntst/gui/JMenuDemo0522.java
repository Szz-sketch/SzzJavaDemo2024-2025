package com.ntst.gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * 单元5：图形用户界面GUI
 * 任务四：菜单的应用
 * 		JMenuBar JMenu JMenuItem
 * 案例：在窗体中实现菜单功能
 * 步骤： 1)创建JMenuBar对象;
 * 		2)创建多个JMenu;
 * 		3)创建菜单项JMenuItem;
 * 		4)将菜单项JMenuItem添加到对应的JMenu;
 * 		5)将JMenu对象添加到菜单栏;
 * 		6)菜单栏添加到窗体.
 * 
 *  案例：在窗体中实现菜单功能
 */
public class JMenuDemo0522 extends JFrame{

	public JMenuDemo0522() {
		super("菜单的应用");
		//1)创建JMenuBar对象
		JMenuBar mBar = new JMenuBar();
		//2)创建多个JMenu
		JMenu m_file = new JMenu("文件(F)");
		JMenu m_edit = new JMenu("编辑(E)");
		JMenu m_source = new JMenu("源码(S)");
		JMenu m_run = new JMenu("运行(R)");
		//设置快捷方式
		m_file.setMnemonic('F');
		m_edit.setMnemonic('E');
		m_source.setMnemonic('S');
		m_run.setMnemonic('R');
		//3)创建菜单项JMenuItem
		JMenuItem item11 = new JMenuItem("新建(N)");
		JMenuItem item12 = new JMenuItem("打开(O)");
		JMenuItem item13 = new JMenuItem("保存(S)");
		JMenuItem item14 = new JMenuItem("关闭(X)");
		
		JMenuItem item31 = new JMenuItem("更正缩进(I)");
		//4)将菜单项JMenuItem添加到对应的JMenu
		m_file.add(item11);
		m_file.add(item12);
		m_file.add(item13);
		m_file.add(item14);
		
		m_source.add(item31);
		//5)将JMenu对象添加到菜单栏
		mBar.add(m_file);
		mBar.add(m_edit);
		mBar.add(m_source);
		mBar.add(m_run);
		//6)菜单栏添加到窗体
		this.setJMenuBar(mBar);
		//设置位置，大小
		this.setBounds(890, 380, 300, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		//测试
		new JMenuDemo0522();
	}
}
