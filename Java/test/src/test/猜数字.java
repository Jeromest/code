package test;

import java.util.Scanner;
import java.util.Random;

public class ������ {

	public static void main(String[] args) {
		int count=0;
		System.out.println("��Ϸ��ʼ!");
		Random r=new Random();
		int game=r.nextInt(100)+1;
		System.out.println("���һ������(1-100֮��)");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(true) {
			if(input>game) {
				System.out.println("����������ִ���!");
			}else if(input<game) {
				System.out.println("�����������С��!");
			}
			count++;
			if(input==game) {
				System.out.println("��ϲ��¶���!�����"+count+"��!");
				break;
			}
			System.out.println("��������룺");
			sc=new Scanner(System.in);
			input=sc.nextInt();
		}
	}

}
