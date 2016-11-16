
public class Battery extends Subject {
	private int level = 100;
	
	public void consume(int amount){
		level -= amount;
		notifyObserver();
	}
	public void charge(int amount){
		level += amount;
		notifyObserver();
	}
	public int getLevel(){
		return level;
	}
}
