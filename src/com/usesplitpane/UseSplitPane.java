package com.usesplitpane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UseSplitPane {

	public static void main(String[] args) {
		//创建窗体
		JFrame frm = new JFrame("使用JSplitPane");
		//设置窗体关闭方式
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//创建垂直分割面板
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT); //Orientation：方向、定位、取向、方针
		frm.getContentPane().add(splitPane); //JFrame:用getContentPane()获得内容面板，而后向其中添加组件
		
		//创建文本框并添加到面板的左侧（上侧）
		JTextField input = new JTextField();	//text field：文本框
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT); //Constants：不变的经常的、常数恒量
		input.setColumns(25);
		splitPane.setLeftComponent(input);
		
		//创建搜索按钮并添加到面板的右侧（下侧）
		JButton searchBtn = new JButton("搜索");
		splitPane.setRightComponent(searchBtn);
		
		//设置分割比例，上侧为140个像素高
		splitPane.setDividerLocation(120);	//Divider：分割者、圆规
		
		//设置结构（JFrame）的位置与大小并显示
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}
}
