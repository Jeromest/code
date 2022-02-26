package 接口;

public class Person implements Artist, Musician {
	private String name;
	
	
	public Person(String name) {
		this.name=name;
	}

	public void draw() {
		System.out.println(name+"会画画");
	}

	public void sing(String name) {
		System.out.println(name+"会唱歌");
	}

	public void dance(String name) {
		System.out.println(name+"会跳舞");
	}

}
