package test;

import java.util.Scanner;

public class 取数字 {

	public static void main(String[] args) {
		System.out.println("请输入一个四位数：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int A, B, C, D;
		A=input/1000;
		B=input/100%10;
		C=input/10%10;
		D=input%10;
		System.out.println("千位是"+A+"\t百位是"+B+"\t十位是"+C+"\t个位是"+D);
	}

}
