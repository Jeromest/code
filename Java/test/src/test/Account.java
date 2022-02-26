package test;

/*

 银行账户类Account（不能透支），

 包含账号id（10~16位数字），密码password（6位数字），户主姓名name，余额balence

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

* 默认构造账户信息为：1111111111111111,666666，钱三多，888888.88。

*/

public Account() {

	//super();
	this.id = "1111111111111111";
	this.password = 666666;
	this.name = "钱三多";
	this.balence = 888888.88;

}

/*

* 另一个构造方法带4个参数分别初始化4个属性（带数据有效性验证）。

*/

public Account(String id, int password, String name, double balence) {

	this.id = id;
	this.password = password;
	this.name = name;
	this.balence = balence;

}

/*

* 查询余额

*/

public static double selectMoney(Account account) {

	return account.getBalence();

}

/*

* 存钱

*/

public static String setMoney(Account account, double balence) {

		if (balence < 0) {
			return "存钱失败，请正确放入！";
		}

		double d = balence + account.getBalence();
		account.setBalence(d);
		return "您存入了" + balence + "元，现账户余额为+" + d;

}

/*

* 取钱

*/

public static String getMoney(Account account, double balence) {

	double d = account.getBalence();

	if (balence > d) {
		return "您的余额不足！";
	}

	account.setBalence(d - balence);
	return "您取出了" + balence + "元，现账户余额为+" + account.getBalence();

	}

}