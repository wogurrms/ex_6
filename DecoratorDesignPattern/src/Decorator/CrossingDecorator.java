package Decorator;

public class CrossingDecorator extends DisplayDecorator{

	public CrossingDecorator(Display display) {
		super(display);
	}
	
	public void draw(){
		super.draw();
		drawCrossing();
	}
	
	public void drawCrossing(){
		System.out.println("������ ǥ��");
	}

}
