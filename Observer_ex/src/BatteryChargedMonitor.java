
public class BatteryChargedMonitor implements Observer{
	final static private int MAX_BATTERY = 100;
	final static private int ENOUGH_BATTERY = 80;
	private Battery battery;
	
	public BatteryChargedMonitor(Battery battery) {
		this.battery = battery;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		int level = battery.getLevel();
		if(level >= ENOUGH_BATTERY && level < MAX_BATTERY){
			System.out.println("<Notify> Your Battery percentis is : "+level+" %, enough to use phone");
		}
		if(level >= MAX_BATTERY){
			System.out.println("<Notify> Charge complete!!");
		}
	}

}
