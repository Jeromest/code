package �ӿ�;

public class Person implements Artist, Musician {
	private String name;
	
	
	public Person(String name) {
		this.name=name;
	}

	public void draw() {
		System.out.println(name+"�ử��");
	}

	public void sing(String name) {
		System.out.println(name+"�ᳪ��");
	}

	public void dance(String name) {
		System.out.println(name+"������");
	}

}
