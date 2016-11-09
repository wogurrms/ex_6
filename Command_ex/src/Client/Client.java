package Client;

import Object.*;
import Command.*;
import Controller.*;

public class Client {
	public static void main(String[] args){
		TV tv = new TV();
		Car car = new Car();
		
		TvPowerCommand tpc = new TvPowerCommand(tv);
		TvMuteCommand tmc = new TvMuteCommand(tv);
		EngineCommand ec = new EngineCommand(car);
		
		TwoButtonController rc = new TwoButtonController();
		
		rc.setCommand1(tpc);
		rc.setCommand2(tmc);
		
		rc.button1Pressed();
		rc.button2Pressed();
					
		rc.button1Pressed();
		rc.button2Pressed();
		
		
	}
}
