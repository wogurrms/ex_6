package hansung.jaehyuk.ex_5;

public class Employee {
	private String id;
	private String name;
	private int workingHours;
	private int overTimeHours;
	
	//연관관계 구현을 위한 멤버변수
	private PayLogic p1;


	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	
	public int calculatePay(){
		return p1.calculatePay(workingHours, overTimeHours);
	}
	
	public void setPayLogic(PayLogic p1){
		this.p1 = p1;
	}
	
}
