package ��̬;

public class Manager extends Staff {
	private float traffic;//��ͨ����
	private float salary;//��λ����
	private float house;//ס������
	
	public Manager(String ID, String name, String sex, String department, float basewage, String phone, 
			float traffic, float salary, float house) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
		this.house=house;
	}
	
	public float mSalary() {//����ʵ������
		return (float) (getBasewage()+traffic*0.1+salary+house*0.15);
	}
	
	public void display() {
		System.out.println("Ա��ID��"+getID()+"\t������"+getName()+"\t�Ա�"+getSex()+"\t���ţ�"+getDepartment()+
				"\t�������ʣ�"+getBasewage()+"\tʵ�����ʣ�"+mSalary()+"\t���"+"����");
		
	}

}
