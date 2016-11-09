package Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSortView implements Observer{
	private ScoreRecord scoreRecord;
	
	public DataSortView(ScoreRecord scoreRecord){
		this.scoreRecord = scoreRecord;
	}

	public void update() { // 점수 변경을 통보받음
		List<Integer> record = scoreRecord.getScoreRecord(); // 점수를 조회함
		List<Integer> sorted = new ArrayList<Integer>();
		sorted = record;
		Collections.sort(sorted);
		displayScores(sorted); // 조회된 점수를 count만큼 출력함
	}

	public void displayScores(List<Integer> record) {
		System.out.println("Sorted scores : ");

		// viewCount 가 record.size 보다 클 경우를대비하여 && 로 처리
		for (int i = 0; i < record.size(); i++) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}
