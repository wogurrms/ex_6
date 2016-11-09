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
	public void addScore(int score){	// ���ο� ������ �߰���.
		scores.add(score);	// scores ��Ͽ� �־��� ������ �߰���		
		dataSheetView.update();
		dataSortView.update();	// scores�� ������� �뺸��
	}
	
	public List<Integer> getScoreRecord(){
		return scores;
	}
}
