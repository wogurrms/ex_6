package Decorator;

public abstract class DisplayDecorator extends Display{
	Display display;
	public DisplayDecorator(Display display) {
		// TODO Auto-generated constructor stub
		this.display = display;
	}
	public void draw(){
		display.draw();
	}
}
