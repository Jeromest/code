package test;

import java.util.Scanner;

public class ȡ���� {

	public static void main(String[] args) {
		System.out.println("������һ����λ����");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int A, B, C, D;
		A=input/1000;
		B=input/100%10;
		C=input/10%10;
		D=input%10;
		System.out.println("ǧλ��"+A+"\t��λ��"+B+"\tʮλ��"+C+"\t��λ��"+D);
	}

}
