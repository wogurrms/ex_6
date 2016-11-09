package Data;
import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	private Observer observer;
	
	public void setDataSortView(DataSortView dataSortView){
		this.dataSortView = dataSortView;
	}
	
	public void setDataSheetView(DataSheetView dataSheetView){
		this.dataSheetView = dataSheetView;
	}
	
	//setter
	public void addScore(int score){	// 새로운 점수를 추가함.
		scores.add(score);	// scores 목록에 주어진 점수를 추가함		
		dataSheetView.update();
		dataSortView.update();	// scores가 변경됨을 통보함
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
