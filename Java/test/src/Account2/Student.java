package Account2;

public class Student {
	private String name;
	private int age;
	private String number;
	
	public Student() {
		this.name="����";
		this.number="1801";
	}
	
	public Student(String number) {
		this.number=number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	
	public void learningMethod() {
		System.out.println("Сѧ��ѧϰ����������Ӳ����");
	}
	
	public void learningMethod(int age) {
		this.age=21;
		System.out.println("��ѧ��ѧϰ����������˼����");
	}
	
	public void learningMethod(String name, int age) {
		this.name="����";
		this.age=25;
		System.out.println("��ѧ��ѧϰ�������������£�");
	}
	
	public void display() {
		System.out.println("����"+name+"\t���䣺"+age+"\tѧ�ţ�"+number);
	}

}
