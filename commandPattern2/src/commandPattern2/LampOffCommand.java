package commandPattern2;

public class LampOffCommand implements Command {
	Lamp lamp;
	
	public LampOffCommand(Lamp lamp){
		this.lamp = lamp;
	}
	@Override
	public void execute() {
		lamp.turnOff();
	}

}
