package test;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//String name[]= {"��С��","�����","ףС��","����","���","������","ף���","����","����","������"};
		Scanner sc=new Scanner(System.in);
		String name[]=new String[5];
		System.out.println("������������");
		for(int i=0; i<name.length; i++) {
			name[i]=sc.nextLine();
		}
		System.out.println("ѧ������"+name.length);
		for(int i=0; i<name.length; i++) {
				if(name[i].equals(name[i].substring(0, 1)=="��")) {
					System.out.print(name[i]+"\t");	
				//}		
			}
				//System.out.println("����"+i+"��");
		//for(int i=0; i<name.length; i++) {
		//		if(name[i].contains("��")) {
		//			System.out.print(name[i]+"\t");
		//		}
		//}
		//for(int i=0; i<name.length; i++) {
		//		if(name[i].contains("��")) {
		//			System.out.print(name[i]+"\t");
		//		}
		}
	}
}


