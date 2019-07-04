package com.usesplitpane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UseSplitPane {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame("ʹ��JSplitPane");
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������ֱ�ָ����
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT); //Orientation�����򡢶�λ��ȡ�򡢷���
		frm.getContentPane().add(splitPane); //JFrame:��getContentPane()���������壬����������������
		
		//�����ı�����ӵ�������ࣨ�ϲࣩ
		JTextField input = new JTextField();	//text field���ı���
		input.setEditable(true);
		input.setHorizontalAlignment(SwingConstants.LEFT); //Constants������ľ����ġ���������
		input.setColumns(25);
		splitPane.setLeftComponent(input);
		
		//����������ť����ӵ������Ҳࣨ�²ࣩ
		JButton searchBtn = new JButton("����");
		splitPane.setRightComponent(searchBtn);
		
		//���÷ָ�������ϲ�Ϊ140�����ظ�
		splitPane.setDividerLocation(120);	//Divider���ָ��ߡ�Բ��
		
		//���ýṹ��JFrame����λ�����С����ʾ
		frm.setBounds(450, 230, 400, 200);
		frm.setVisible(true);
	}
}
