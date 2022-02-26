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
	
	private JFrame mainFrame;//ѧ�������������
	
	private JPanel top;//��������壬���ѧ����Ϣ����
	private JLabel labelTop;//"¼��"��ǩ
	private JLabel lableName;//"����"��ǩ
	private JTextField textName;//"����"�����
	private JLabel labelAge;//"����"��ǩ
	private JTextField textAge;//"����"�����
	private JLabel labelGrade;//"�ɼ�"��ǩ
	private JTextField textGrade;//"�ɼ�"�����
	private JButton btnAdd;//"���"��ť
	
	private JPanel middle;//��ʾ����壬��ʾѧ����Ϣ����
	private JLabel labelMiddle;//"�鿴����"��ǩ
	private JButton btnShowAll;//"��ʾ"��ť
	private JButton btnSortAll;//"����"��ť
	private JTextArea areaShowAll;//ѧ����Ϣ��ʾ��
	private JPanel bottom;//��ѯ����壬��ѯѧ����Ϣ
	private JLabel labelBottom;//"��ѯ"��ǩ
	private JLabel labelQuery;//"����"��ǩ
	private JTextField textQuery;//"����"�����
	private JButton btnQuery;//"�ύ"��ť
	private JTextArea areaQuery;//��ѯ�����ʾ��
	
	public StudentManagement(String title) {
		mainFrame=new JFrame(title);
	}
	
	public void run() {
		mainFrame.setBounds(100, 100, 500, 250);//���ô���λ�ô�С
		mainFrame.setVisible(true);//���ô��ڿɼ�
		//���õ���"�ر�"��ť�Ĺ���Ϊ�˳�����
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addInput();
		addShowAll();
		addQuery();
		
		mainFrame.validate();
	}

	private void addInput() {
		top=new JPanel();
		labelTop=new JLabel("¼��| ");
		//labelName=new JLabel("����");
		labelAge=new JLabel("����");
		labelGrade=new JLabel("�ɼ�");
		textName=new JTextField(10);
		textAge=new JTextField(6);
		textGrade=new JTextField(6);
		btnAdd=new JButton("���");
		
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
		
		labelMiddle=new JLabel("�鿴����| ");
		btnShowAll=new JButton("��ʾ");
		btnSortAll=new JButton("����");
		areaShowAll=new JTextArea(7,25);
		
		middle.add(labelMiddle);
		middle.add(btnShowAll);
		middle.add(btnSortAll);
		middle.add(areaShowAll);
		
		mainFrame.add(middle,BorderLayout.CENTER);
	}
	
	private void addQuery() {
		bottom=new JPanel();
		
		labelBottom=new JLabel("��ѯ| ");
		labelQuery=new JLabel("������");
		textQuery=new JTextField(9);
		btnQuery=new JButton("�ύ");
		areaQuery=new JTextArea(1,20);
		
		bottom.add(labelBottom);
		bottom.add(labelQuery);
		bottom.add(textQuery);
		bottom.add(btnQuery);
		bottom.add(areaQuery);
		
		mainFrame.add(bottom,BorderLayout.SOUTH);
	}

}
