import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	public void addObserver(Observer observer){
		observers.add(observer);
	}

	public void notifyObserver(){
		for(Observer o: observers){
			o.update();
		}
	}
}
