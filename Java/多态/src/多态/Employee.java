package ��̬;

public class Employee extends Staff {
	private float traffic;//��ͨ����
	private float salary;//��λ����
	
	public Employee(String ID, String name, String sex, String department, float basewage, String phone, 
			float traffic, float salary) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
	}
	
	public float eSalary() {//����ʵ������
		return getBasewage()+traffic+salary;
	}
	
	public void display() {
		System.out.println("Ա��ID��"+getID()+"\t������"+getName()+"\t�Ա�"+getSex()+"\t���ţ�"+getDepartment()+
				"\t�������ʣ�"+getBasewage()+"\tʵ�����ʣ�"+eSalary()+"\t���"+"��ͨԱ��");
	}

}
