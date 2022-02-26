package 多态;

public class Salesman extends Staff {
	private float traffic;
	private float salary;//岗位工资
	private float communication;
	
	public Salesman(String ID, String name, String sex, String department, float basewage, String phone,
			float traffic, float salary, float communication) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
		this.communication=communication;
	}
	
	public float sSalary() {//计算实发工资
		return (float) (getBasewage()+traffic+salary*0.02+communication);
	}

	public void display() {
		System.out.println("员工ID："+getID()+"\t姓名："+getName()+"\t性别："+getSex()+"\t部门："+getDepartment()+
				"\t基本工资："+getBasewage()+"\t实发工资："+sSalary()+"\t类别："+"销售员");
	}

}
