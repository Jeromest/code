package ��̬;

public class Salesman extends Staff {
	private float traffic;
	private float salary;//��λ����
	private float communication;
	
	public Salesman(String ID, String name, String sex, String department, float basewage, String phone,
			float traffic, float salary, float communication) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
		this.communication=communication;
	}
	
	public float sSalary() {//����ʵ������
		return (float) (getBasewage()+traffic+salary*0.02+communication);
	}

	public void display() {
		System.out.println("Ա��ID��"+getID()+"\t������"+getName()+"\t�Ա�"+getSex()+"\t���ţ�"+getDepartment()+
				"\t�������ʣ�"+getBasewage()+"\tʵ�����ʣ�"+sSalary()+"\t���"+"����Ա");
	}

}
