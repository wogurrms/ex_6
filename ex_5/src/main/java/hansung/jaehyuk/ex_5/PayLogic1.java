package hansung.jaehyuk.ex_5;

public class PayLogic1 implements PayLogic{

	public int calculatePay(int workingHours, int overTimeHours) {
		
		return (10 * workingHours) + (15 * overTimeHours);
	}

}
