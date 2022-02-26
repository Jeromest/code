package ��̬;

public abstract class Staff {
	private String ID;
	private String name;
	private String sex;
	private String department;//����
	private float basewage;//��������
	private String phone;
	
	public Staff(String ID, String name, String sex, String department, float basewage, String phone) {
		this.ID=ID;
		this.name=name;
		this.sex=sex;
		this.department=department;
		this.basewage=basewage;
		this.phone=phone;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public float getBasewage() {
		return basewage;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public abstract void display();

}
