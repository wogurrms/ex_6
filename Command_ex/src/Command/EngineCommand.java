package Command;

import Object.*;

public class EngineCommand implements Command {
	private Car car;
	
	public EngineCommand(Car car){
		this.car = car;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		car.start();
	}

}
