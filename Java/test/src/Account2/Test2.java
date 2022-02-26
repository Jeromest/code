package Account2;

public class Test2 {

	public static void main(String[] args) {
		AccountInfo a1=new AccountInfo("张三", 100);
		AccountInfo a2=new AccountInfo("李四", 200);
		//a1.selectMoney();
		System.out.println("----------显示各自原来余额：----------");
		//System.out.println("户名："+a1.+"\t");
		a1.setBalance(100, 50);
		//a1.selectMoney();
	}

}
