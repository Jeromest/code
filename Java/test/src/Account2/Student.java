package Account2;

public class Student {
	private String name;
	private int age;
	private String number;
	
	public Student() {
		this.name="张三";
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
		System.out.println("小学生学习方法，死记硬背！");
	}
	
	public void learningMethod(int age) {
		this.age=21;
		System.out.println("中学生学习方法，独立思考！");
	}
	
	public void learningMethod(String name, int age) {
		this.name="李四";
		this.age=25;
		System.out.println("大学生学习方法，积极创新！");
	}
	
	public void display() {
		System.out.println("我是"+name+"\t年龄："+age+"\t学号："+number);
	}

}
