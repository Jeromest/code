package A1;

public class Test2 {

	public static void main(String[] args) {
		MobilePhone m1=new MobilePhone("19800000000");
		System.out.println(m1.display()+"\t���ѣ�"+m1.pay(30, 0.3));
		MobilePhone m2=new MobilePhone("17609261189");
		System.out.println(m2.display()+"\t���ѣ�"+m2.pay(50, 0.3));
	}

}
