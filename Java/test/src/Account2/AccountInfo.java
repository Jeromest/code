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
	
	public double inMoney(int i) {	//���
		return balance+=i;
		//double d = balence + account.getBalence();
		//account.setBalence(d);
		//return "��������" + balence + "Ԫ�����˻����Ϊ+" + d;

	}
	
	public double outMoney(int j) {	//ȡ��
		return balance-=j;
	}
	
	public void displayAccount(String name) {	//��ʾ�˻�
		
	}
	
	public static double selectMoney(Account account) {		//��ѯ���

		return account.getBalence();
	}
	
	//public void balanceInquiry() {	//��ѯ���
	//	System.out.println("--------ԭ�����--------");
	//	System.out.println("�˻�����"+account+"\t\t�˻���"+balance);
	//	System.out.println("--------��ǮȡǮ--------");
	//	System.out.println("�˻�����"+account+"\t\t��Ǯ��");
	//	System.out.println("--------�������--------");
	//	System.out.println("�˻�����"+account+"\t\t�˻���"+balance);
	//}

}
