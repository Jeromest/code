package 接口;

public class Test2 {

	public static void main(String[] args) {
		//Person teacher=new Artist("");
		Artist teacher=new Person("小红");
		teacher.draw();
		
		Musician student=new Person("");
		student.dance("李明");
		student.sing("lili");
		Musician teacher1=new Person("Jerome");
		teacher1.dance("Jerome");
	}

}
