package A1;

public class Student extends Person{
	private String sid;
	private static int num=0;
	
	public Student(String name, int age, String sid) {
		super(name, age);
		this.sid=sid;
		num++;
	}
	
	public static int getNum() {
		return num;
	}
	
	public String display() {
		return super.display()+"\tѧ�ţ�"+sid;
	}
	
	//public void display2() {
	//	System.out.println("��������"+num);
	//}

}
