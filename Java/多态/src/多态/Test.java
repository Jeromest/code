package ��̬;

public class Test {

	public static void main(String[] args) {
		Staff e=new Employee("0001", "lili", "Ů", "����", 1800, "1234567890", 100, 500);
		e.display();
		Staff s=new Salesman("0002", "Jerome", "��", "����", 1800, "1923837494", 500, 2200, 200);
		s.display();
		Staff m=new Manager("0003", "Tom", "��", "����", 1800, "1753236768", 1800, 1000, 1800);
		m.display();
	}

}
