package Client;

import Decorator.CrossingDecorator;
import Decorator.Display;
import Decorator.LaneDecorator;
import Decorator.RoadDisplay;
import Decorator.TrafficDecorator;

public class Client {
	public static void main(String args[]){

		// 기본 도로와 차선 출력 하고 싶을 때
		Display d1 = new LaneDecorator(new RoadDisplay());
		d1.draw();
		System.out.println();
		// 기본 도로와 차선&교통량을 출력 하고 싶을 때
		Display d2 = new TrafficDecorator(d1);
		d2.draw();
		System.out.println();
		// 기본 도로와 차선&교차로
		Display d3 = new CrossingDecorator(d1);
		d3.draw();
		System.out.println();
		// 기본 도로와 차선&교통량&교차로
		Display d4 = new CrossingDecorator(d2);
		d4.draw();
		System.out.println();
		
	}

}
