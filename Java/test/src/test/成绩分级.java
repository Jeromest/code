package test;

import java.util.Scanner;

public class �ɼ��ּ� {

	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(true) {
			if(input>=0 && input<=100) {
				switch(input/10) {
				case 10:
				case 9:
					System.out.println("���㣡");
					break;
				case 8:
				case 7:
					System.out.println("���ã�");
					break;
				case 6:
					System.out.println("����");
					break;
				case 5:
				case 4:
				case 3:
				case 2:
				case 1:
				case 0:
					System.out.println("������");
					break;
				}
			}else {
				System.out.println("����������������룡");
			}
			//sc=new Scanner(System.in);
			input=sc.nextInt();
		}
	}

}
