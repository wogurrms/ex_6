package Main;
import Data.*;

public class Client {
	public static void main(String[] args){
		ScoreRecord scoreRecord = new ScoreRecord();
		//3개의 정수만 출력
		DataSheetView dataSheetView = new DataSheetView(scoreRecord,3);
		DataSortView dataSortView = new DataSortView(scoreRecord);
		
		scoreRecord.setDataSortView(dataSortView);
		scoreRecord.setDataSheetView(dataSheetView);
		
		for(int index = 5; index >= 1; index--){
			int score = index * 10;
			System.out.println("Adding "+score);
			//10 20 30 40 50 추가함, 추가할때마다 최대3개의 점수를 출력
			scoreRecord.addScore(score);
		}
	}
}
