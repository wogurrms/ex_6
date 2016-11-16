
public class LowBatteryWarning implements Observer{
	public static final int LOW_BATTERY = 30;
	private Battery battery;
	
	public LowBatteryWarning(Battery battery){
		this.battery = battery;
	}
	
	public void update(){
		int level = battery.getLevel();
		if(level < LOW_BATTERY){
			System.out.println("<Warning> Low battery : "+level+" Comared with "+LOW_BATTERY);
		}
	}
}
