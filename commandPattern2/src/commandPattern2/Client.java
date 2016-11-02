package commandPattern2;

public class Client {
	
	static public void main(String args[]){
		Button b = new Button();
		
		Lamp lamp = new Lamp();		
		Alarm alarm = new Alarm();

		
		LampOnCommand loc = new LampOnCommand(lamp);
		LampOffCommand lfc = new LampOffCommand(lamp);
		AlarmStartCommand asc = new AlarmStartCommand(alarm);
		
		
		b.setCommand(loc);
		b.pressed();
		
		
		b.setCommand(lfc);
		b.pressed();
		
		
		b.setCommand(asc);
		b.pressed();
	}
}
