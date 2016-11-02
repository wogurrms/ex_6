package commandPattern2;

public class Button {
	private Command command;	
	
	public void setCommand(Command command){
		this.command = command;
	}
	public void pressed(){
		command.execute();
	}
	
	
}
