package A1;

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("����", 20, "10001");
		Student s2=new Student("����", 22, "10002");
		Student s3=new Student("����", 18, "10003");
		Student s4=new Student("����", 19, "10004");
		System.out.println(s1.display());
		System.out.println(s2.display());
		System.out.println(s3.display());
		System.out.println(s4.display());
		System.out.println("��������"+Student.getNum());
	}

}
