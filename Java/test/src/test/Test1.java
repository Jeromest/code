package test;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������ַ�����");
		String s=sc.nextLine();
		String str=s.substring(s.indexOf("=")+1);
		System.out.println("�滻ǰ�ַ�����"+str);
		if(str.length()>100) {
			System.out.println("���Ȳ��ܳ���100��");
		}else {
			String str2=str.replace("?", "Java");
			if(str2.length()>80) {
				System.out.println("�滻���ַ�����"+str2.substring(0, 79));
			}else {
				System.out.println("�滻���ַ�����"+str2);
			}
			System.out.println("�滻���ַ�������"+str2.length());
		}
	}

}
