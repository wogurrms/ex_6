package Client;

import Decorator.CrossingDecorator;
import Decorator.Display;
import Decorator.LaneDecorator;
import Decorator.RoadDisplay;
import Decorator.TrafficDecorator;

public class Client {
	public static void main(String args[]){

		// �⺻ ���ο� ���� ��� �ϰ� ���� ��
		Display d1 = new LaneDecorator(new RoadDisplay());
		d1.draw();
		System.out.println();
		// �⺻ ���ο� ����&���뷮�� ��� �ϰ� ���� ��
		Display d2 = new TrafficDecorator(d1);
		d2.draw();
		System.out.println();
		// �⺻ ���ο� ����&������
		Display d3 = new CrossingDecorator(d1);
		d3.draw();
		System.out.println();
		// �⺻ ���ο� ����&���뷮&������
		Display d4 = new CrossingDecorator(d2);
		d4.draw();
		System.out.println();
		
	}

}
