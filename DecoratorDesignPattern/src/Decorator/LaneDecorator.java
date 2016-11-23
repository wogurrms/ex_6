package Decorator;


public class LaneDecorator extends DisplayDecorator{

	public LaneDecorator(Display display) {
		super(display);
	}
	public void draw(){
		super.draw();
		drawLane();
	}
	public void drawLane(){
		System.out.println("차선 표시");
	}

}
