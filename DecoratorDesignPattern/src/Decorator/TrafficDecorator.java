package Decorator;


public class TrafficDecorator extends DisplayDecorator{
	
	public TrafficDecorator(Display display) {
		super(display);
	}

	public void draw(){
		super.draw();
		drawTraffic();
	}
	
	public void drawTraffic(){
		System.out.println("교통상황표시");
	}
}
