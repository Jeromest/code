package �ӿ�;

public class Test2 {

	public static void main(String[] args) {
		//Person teacher=new Artist("");
		Artist teacher=new Person("С��");
		teacher.draw();
		
		Musician student=new Person("");
		student.dance("����");
		student.sing("lili");
		Musician teacher1=new Person("Jerome");
		teacher1.dance("Jerome");
	}

}
