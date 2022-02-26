package 多态;

public class Employee extends Staff {
	private float traffic;//交通补贴
	private float salary;//岗位工资
	
	public Employee(String ID, String name, String sex, String department, float basewage, String phone, 
			float traffic, float salary) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
	}
	
	public float eSalary() {//计算实发工资
		return getBasewage()+traffic+salary;
	}
	
	public void display() {
		System.out.println("员工ID："+getID()+"\t姓名："+getName()+"\t性别："+getSex()+"\t部门："+getDepartment()+
				"\t基本工资："+getBasewage()+"\t实发工资："+eSalary()+"\t类别："+"普通员工");
	}

}
