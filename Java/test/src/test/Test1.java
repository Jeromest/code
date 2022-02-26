package test;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		String s=sc.nextLine();
		String str=s.substring(s.indexOf("=")+1);
		System.out.println("Ìæ»»Ç°×Ö·û´®£º"+str);
		if(str.length()>100) {
			System.out.println("³¤¶È²»ÄÜ³¬¹ý100£¡");
		}else {
			String str2=str.replace("?", "Java");
			if(str2.length()>80) {
				System.out.println("Ìæ»»ºó×Ö·û´®£º"+str2.substring(0, 79));
			}else {
				System.out.println("Ìæ»»ºó×Ö·û´®£º"+str2);
			}
			System.out.println("Ìæ»»ºó×Ö·û¸öÊý£º"+str2.length());
		}
	}

}
