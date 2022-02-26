package test;

import java.util.Scanner;

public class 成绩分级 {

	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(true) {
			if(input>=0 && input<=100) {
				switch(input/10) {
				case 10:
				case 9:
					System.out.println("优秀！");
					break;
				case 8:
				case 7:
					System.out.println("良好！");
					break;
				case 6:
					System.out.println("及格！");
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("不及格！");
					break;
				}
			}else {
				System.out.println("输入错误，请重新输入！");
			}
			//sc=new Scanner(System.in);
			input=sc.nextInt();
		}
	}

}
