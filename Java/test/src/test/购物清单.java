package test;
import java.util.*;
import java.text.DecimalFormat;

public class �����嵥 {

	public static void main(String[] args) {
		System.out.println("����������۸�");
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
		System.out.println("�����빺��������");
		//sc=new Scanner
		int n1=sc.nextInt();
		System.out.println("�������˶�Ь�۸�");
		int p2=sc.nextInt();
		System.out.println("�����빺��������");
		int n2=sc.nextInt();
		double discount=p1*n1+p2*n2;
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("�ܼ۸�"+df.format(discount));
		System.out.println("�븶�");
		double money=sc.nextInt();
		System.out.println("**************���ѵ�*************");
		System.out.println("������Ʒ��\t�ܼ�\t����\t���");
		System.out.println("���£�\t\t��"+p1+"\t"+n1+"\t"+(double)p1*n1);
		System.out.println("�˶�Ь��\t\t��"+p2+"\t"+n2+"\t"+(double)p2*n2);
		System.out.println();
		System.out.println("�ۿۣ�\t\t"+"8��");
		System.out.println("����ܼƣ�\t��"+discount);
		System.out.println("ʵ�ʸ��\t��"+money);
		System.out.println("���㣺\t\t��"+(money-discount));
		System.out.println("���ι����õĻ����ǣ�"+(int)discount/100*3);
		System.out.println("*****************************");
	}

}
