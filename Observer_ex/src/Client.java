
public class Client {
	public static void main(String args[]){
		Battery battery = new Battery();
		
		Observer batteryDisplay = new BatteryLevelDisplay(battery);
		Observer lowBatteryWarning = new LowBatteryWarning(battery);
		Observer batteryChargedMonitor = new BatteryChargedMonitor(battery);
		
		battery.addObserver(batteryDisplay);
		battery.addObserver(lowBatteryWarning);
		battery.addObserver(batteryChargedMonitor);
		
		battery.consume(20);
		battery.consume(50);
		battery.consume(10);
		
		battery.charge(70);
		battery.charge(10);
	}
}
