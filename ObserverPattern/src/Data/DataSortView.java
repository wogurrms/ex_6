package Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataSortView implements Observer{
	private ScoreRecord scoreRecord;
	
	public DataSortView(ScoreRecord scoreRecord){
		this.scoreRecord = scoreRecord;
	}

	public void update() { // ���� ������ �뺸����
		List<Integer> record = scoreRecord.getScoreRecord(); // ������ ��ȸ��
		List<Integer> sorted = new ArrayList<Integer>();
		sorted = record;
		Collections.sort(sorted);
		displayScores(sorted); // ��ȸ�� ������ count��ŭ �����
	}

	public void displayScores(List<Integer> record) {
		System.out.println("Sorted scores : ");

		// viewCount �� record.size ���� Ŭ ��츦����Ͽ� && �� ó��
		for (int i = 0; i < record.size(); i++) {
			System.out.println(record.get(i) + " ");
		}
		System.out.println();
	}
}
