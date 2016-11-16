package Data;
import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	//setter
	public void addScore(int score){	// ���ο� ������ �߰���.
		scores.add(score);	// scores ��Ͽ� �־��� ������ �߰���
		notifyObservers();
	}
	
	public void notifyObservers(){
		for(Observer o : observers){
			o.update();
		}
	}
	
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
