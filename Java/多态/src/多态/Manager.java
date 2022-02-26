package 多态;

public class Manager extends Staff {
	private float traffic;//交通补贴
	private float salary;//岗位工资
	private float house;//住房补贴
	
	public Manager(String ID, String name, String sex, String department, float basewage, String phone, 
			float traffic, float salary, float house) {
		super(ID, name, sex, department, basewage, phone);
		this.traffic=traffic;
		this.salary=salary;
		this.house=house;
	}
	
	public float mSalary() {//计算实发工资
		return (float) (getBasewage()+traffic*0.1+salary+house*0.15);
	}
	
	public void display() {
		System.out.println("员工ID："+getID()+"\t姓名："+getName()+"\t性别："+getSex()+"\t部门："+getDepartment()+
				"\t基本工资："+getBasewage()+"\t实发工资："+mSalary()+"\t类别："+"经理");
		
	}

}
