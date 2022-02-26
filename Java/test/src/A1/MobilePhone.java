package A1;

public class MobilePhone extends Phone{
	private String brand;
	private String owerId;
	
	public MobilePhone(String code){
		super(code);
		//this.brand=brand;
		//this.owerId=owerId;
	}
	
	public double pay(int time, double price) {
		return (time*price);
	}

}
