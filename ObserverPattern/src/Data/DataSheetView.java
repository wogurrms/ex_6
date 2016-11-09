package Data;
import java.util.List;

public class DataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount){
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update(){	//점수 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord();	//점수를 조회함
		displayScores(record,viewCount);	//조회된 점수를 count만큼 출력함
	}
	
	public void displayScores(List<Integer> record, int viewCount){
		System.out.println("List of "+ viewCount + "entries : ");

		//viewCount 가 record.size 보다 클 경우를대비하여 && 로 처리 
		for(int i=0 ; i < viewCount && i < record.size() ; i++ ){
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}
