package Data;
import java.util.List;

public class DataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount){
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update(){	//���� ������ �뺸����
		List<Integer> record = scoreRecord.getScoreRecord();	//������ ��ȸ��
		displayScores(record,viewCount);	//��ȸ�� ������ count��ŭ �����
	}
	
	public void displayScores(List<Integer> record, int viewCount){
		System.out.println("List of "+ viewCount + "entries : ");

		//viewCount �� record.size ���� Ŭ ��츦����Ͽ� && �� ó�� 
		for(int i=0 ; i < viewCount && i < record.size() ; i++ ){
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}
