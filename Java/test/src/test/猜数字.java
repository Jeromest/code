package test;

import java.util.Scanner;
import java.util.Random;

public class 猜数字 {

	public static void main(String[] args) {
		int count=0;
		System.out.println("游戏开始!");
		Random r=new Random();
		int game=r.nextInt(100)+1;
		System.out.println("请猜一个数：(1-100之间)");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(true) {
			if(input>game) {
				System.out.println("你输入的数字大了!");
			}else if(input<game) {
				System.out.println("你输入的数字小了!");
			}
			count++;
			if(input==game) {
				System.out.println("恭喜你猜对了!你猜了"+count+"次!");
				break;
			}
			System.out.println("请继续输入：");
			sc=new Scanner(System.in);
			input=sc.nextInt();
		}
	}

}
