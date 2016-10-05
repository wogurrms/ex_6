package hansung.jaehyuk.ex_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPayLogic {
	Employee emp;
	
	
	@Before
	public void setUp(){
		emp = new Employee();
		emp.setWorkingHours(100);
		emp.setOverTimeHours(50);
	}
	
	@Test
	public void testPayLogic1() {
		emp.setPayLogic(new PayLogic1());
		
		int pay = emp.calculatePay();
		
		assertEquals(1750,pay);
	}
	
	
	@Test
	public void testPayLogic2() {
		emp.setPayLogic(new PayLogic1());
		
		int pay = emp.calculatePay();
		
		assertEquals(2000,pay);
	}

}
