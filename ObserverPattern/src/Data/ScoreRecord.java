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
	public void addScore(int score){	// 새로운 점수를 추가함.
		scores.add(score);	// scores 목록에 주어진 점수를 추가함
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
