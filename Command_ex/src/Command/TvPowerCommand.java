package Command;

import Object.*;

public class TvPowerCommand implements Command{
	private TV tv;
	
	public TvPowerCommand(TV tv){
		this.tv = tv;
	}
	
	public void execute(){
		tv.power();
	}
}
