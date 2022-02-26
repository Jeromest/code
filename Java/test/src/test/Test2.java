package test;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//String name[]= {"张小五","李红艳","祝小涛","张敏","李进","李亚鹏","祝金峰","李燕","张亮","李向阳"};
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		System.out.println("请输入姓名：");
		for(int i=0; i<name.length; i++) {
			name[i]=sc.nextLine();
		}
		System.out.println("学生数："+name.length);
		for(int i=0; i<name.length; i++) {
				if(name[i].equals(name[i].substring(0, 1)=="张")) {
					System.out.print(name[i]+"\t");	
				//}		
			}
				//System.out.println("共："+i+"人");
		//for(int i=0; i<name.length; i++) {
		//		if(name[i].contains("李")) {
		//			System.out.print(name[i]+"\t");
		//		}
		//}
		//for(int i=0; i<name.length; i++) {
		//		if(name[i].contains("宋")) {
		//			System.out.print(name[i]+"\t");
		//		}
		}
	}
}


