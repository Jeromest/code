package test;

/*

 �����˻���Account������͸֧����

 �����˺�id��10~16λ���֣�������password��6λ���֣�����������name�����balence

 */

public class Account {

	private String id;
	private int password;
	private String name;
	private double balence;
	
public String getId() {
		return id;

}

public void setId(String id) {

	this.id = id;

}

public int getPassword() {

	return password;

}

public void setPassword(int password) {

 
	this.password = password;

}

public String getName() {

	return name;

}

public void setName(String name) {

	this.name = name;

}

public double getBalence() {

	return balence;

}

public void setBalence(double balence) {

	this.balence = balence;

}

/*

* Ĭ�Ϲ����˻���ϢΪ��1111111111111111,666666��Ǯ���࣬888888.88��

*/

public Account() {

	//super();
	this.id = "1111111111111111";
	this.password = 666666;
	this.name = "Ǯ����";
	this.balence = 888888.88;

}

/*

* ��һ�����췽����4�������ֱ��ʼ��4�����ԣ���������Ч����֤����

*/

public Account(String id, int password, String name, double balence) {

	this.id = id;
	this.password = password;
	this.name = name;
	this.balence = balence;

}

/*

* ��ѯ���

*/

public static double selectMoney(Account account) {

	return account.getBalence();

}

/*

* ��Ǯ

*/

public static String setMoney(Account account, double balence) {

		if (balence < 0) {
			return "��Ǯʧ�ܣ�����ȷ���룡";
		}

		double d = balence + account.getBalence();
		account.setBalence(d);
		return "��������" + balence + "Ԫ�����˻����Ϊ+" + d;

}

/*

* ȡǮ

*/

public static String getMoney(Account account, double balence) {

	double d = account.getBalence();

	if (balence > d) {
		return "�������㣡";
	}

	account.setBalence(d - balence);
	return "��ȡ����" + balence + "Ԫ�����˻����Ϊ+" + account.getBalence();

	}

}