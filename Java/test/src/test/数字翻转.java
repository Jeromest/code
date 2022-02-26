package test;

import java.util.Scanner;

public class 数字翻转 {

	public static void main(String[] args) {
		System.out.println("请输入一个五位数：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("转换前为："+input);
		int result=0;
		while(true) {
			int n=input%10;
			result=result*10+n;
			input/=10;
			if(input==0) {
				break;
			}
		}
		System.out.println("转换后为："+result);
	}

}
