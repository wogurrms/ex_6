package Object;

public class Car {
	private boolean startOn = false;
	
	public void start(){
		startOn =! startOn;

		
		if(startOn)
			System.out.println("Engine On");
		else
			System.out.println("Engine Off");
		
	}
}
