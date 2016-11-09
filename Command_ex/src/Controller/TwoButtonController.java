package Controller;
import Command.*;

public class TwoButtonController {
	private Command command1;
	private Command command2;

	
	public void setCommand1(Command command1) {
		this.command1 = command1;
	}
	public void setCommand2(Command command2) {
		this.command2 = command2;
	}
	
	public void button1Pressed(){
		command1.execute();
	}
	public void button2Pressed(){
		command2.execute();
	}
}
