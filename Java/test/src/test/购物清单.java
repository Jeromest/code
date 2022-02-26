package test;
import java.util.*;
import java.text.DecimalFormat;

public class 购物清单 {

	public static void main(String[] args) {
		System.out.println("请输入衬衫价格：");
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
		System.out.println("请输入购买数量：");
		//sc=new Scanner
		int n1=sc.nextInt();
		System.out.println("请输入运动鞋价格：");
		int p2=sc.nextInt();
		System.out.println("请输入购买数量：");
		int n2=sc.nextInt();
		double discount=p1*n1+p2*n2;
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("总价格"+df.format(discount));
		System.out.println("请付款：");
		double money=sc.nextInt();
		System.out.println("**************消费单*************");
		System.out.println("购买物品：\t总价\t数量\t金额");
		System.out.println("衬衣：\t\t￥"+p1+"\t"+n1+"\t"+(double)p1*n1);
		System.out.println("运动鞋：\t\t￥"+p2+"\t"+n2+"\t"+(double)p2*n2);
		System.out.println();
		System.out.println("折扣：\t\t"+"8折");
		System.out.println("金额总计：\t￥"+discount);
		System.out.println("实际付款：\t￥"+money);
		System.out.println("找零：\t\t￥"+(money-discount));
		System.out.println("本次购物获得的积分是："+(int)discount/100*3);
		System.out.println("*****************************");
	}

}
