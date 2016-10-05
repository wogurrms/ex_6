package hansung.jaehyuk.ex_5;

public class PayLogic2 implements PayLogic{

	public int calculatePay(int workingHours, int overTimeHours) {
		
		return (10 * workingHours) + (20 * overTimeHours);
	}

}
