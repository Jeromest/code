package test;

import java.util.Scanner;

public class ���ַ�ת {

	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("ת��ǰΪ��"+input);
		int result=0;
		while(true) {
			int n=input%10;
			result=result*10+n;
			input/=10;
			if(input==0) {
				break;
			}
		}
		System.out.println("ת����Ϊ��"+result);
	}

}
