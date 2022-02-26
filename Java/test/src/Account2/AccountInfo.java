package Account2;

import test.Account;

public class AccountInfo {
	//private String name;
	private String account;
	private double balance;
	
	public AccountInfo() {
		//this.name="";
		this.account="lisa";
		this.balance=200;
	}
	
	public AccountInfo(String account, double balance) {
		//this.name="";
		this.account=account;
		this.balance=balance;
	}
	
	public void setAccount(String account) {
		this.account=account;
	}
	public String getAccount() {
		return account;
	}
	
	public void setBalance(int balance, int i) {
		this.balance=balance+i;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//public String display(String name) {
	//	return name;
	//}
	
	//public int display(int balance) {
	//	return balance;
	//}
	
	public double inMoney(int i) {	//存款
		return balance+=i;
		//double d = balence + account.getBalence();
		//account.setBalence(d);
		//return "您存入了" + balence + "元，现账户余额为+" + d;

	}
	
	public double outMoney(int j) {	//取款
		return balance-=j;
	}
	
	public void displayAccount(String name) {	//显示账户
		
	}
	
	public static double selectMoney(Account account) {		//查询余额

		return account.getBalence();
	}
	
	//public void balanceInquiry() {	//查询余额
	//	System.out.println("--------原来余额--------");
	//	System.out.println("账户名："+account+"\t\t账户余额："+balance);
	//	System.out.println("--------存钱取钱--------");
	//	System.out.println("账户名："+account+"\t\t存钱：");
	//	System.out.println("--------现在余额--------");
	//	System.out.println("账户名："+account+"\t\t账户余额："+balance);
	//}

}
