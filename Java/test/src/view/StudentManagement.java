package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentManagement {
	
	private final long serialVersionUID=1L;
	
	private JFrame mainFrame;//学生管理的主窗口
	
	private JPanel top;//输入区面板，添加学生信息区域
	private JLabel labelTop;//"录入"标签
	private JLabel lableName;//"姓名"标签
	private JTextField textName;//"姓名"输入框
	private JLabel labelAge;//"年龄"标签
	private JTextField textAge;//"年龄"输入框
	private JLabel labelGrade;//"成绩"标签
	private JTextField textGrade;//"成绩"输入框
	private JButton btnAdd;//"添加"按钮
	
	private JPanel middle;//显示区面板，显示学生信息区域
	private JLabel labelMiddle;//"查看所有"标签
	private JButton btnShowAll;//"显示"按钮
	private JButton btnSortAll;//"排序"按钮
	private JTextArea areaShowAll;//学生信息显示区
	private JPanel bottom;//查询区面板，查询学生信息
	private JLabel labelBottom;//"查询"标签
	private JLabel labelQuery;//"姓名"标签
	private JTextField textQuery;//"姓名"输入框
	private JButton btnQuery;//"提交"按钮
	private JTextArea areaQuery;//查询结果显示区
	
	public StudentManagement(String title) {
		mainFrame=new JFrame(title);
	}
	
	public void run() {
		mainFrame.setBounds(100, 100, 500, 250);//设置窗口位置大小
		mainFrame.setVisible(true);//设置窗口可见
		//设置单击"关闭"按钮的功能为退出程序
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addInput();
		addShowAll();
		addQuery();
		
		mainFrame.validate();
	}

	private void addInput() {
		top=new JPanel();
		labelTop=new JLabel("录入| ");
		//labelName=new JLabel("姓名");
		labelAge=new JLabel("年龄");
		labelGrade=new JLabel("成绩");
		textName=new JTextField(10);
		textAge=new JTextField(6);
		textGrade=new JTextField(6);
		btnAdd=new JButton("添加");
		
		top.add(labelTop);
		//top.add(labelName);
		top.add(textName);
		top.add(labelAge);
		top.add(textAge);
		top.add(labelGrade);
		top.add(textGrade);
		top.add(btnAdd);
		mainFrame.add(top,BorderLayout.NORTH);
	}
	
	private void addShowAll() {
		middle=new JPanel();
		
		labelMiddle=new JLabel("查看所有| ");
		btnShowAll=new JButton("显示");
		btnSortAll=new JButton("排序");
		areaShowAll=new JTextArea(7,25);
		
		middle.add(labelMiddle);
		middle.add(btnShowAll);
		middle.add(btnSortAll);
		middle.add(areaShowAll);
		
		mainFrame.add(middle,BorderLayout.CENTER);
	}
	
	private void addQuery() {
		bottom=new JPanel();
		
		labelBottom=new JLabel("查询| ");
		labelQuery=new JLabel("姓名：");
		textQuery=new JTextField(9);
		btnQuery=new JButton("提交");
		areaQuery=new JTextArea(1,20);
		
		bottom.add(labelBottom);
		bottom.add(labelQuery);
		bottom.add(textQuery);
		bottom.add(btnQuery);
		bottom.add(areaQuery);
		
		mainFrame.add(bottom,BorderLayout.SOUTH);
	}

}
