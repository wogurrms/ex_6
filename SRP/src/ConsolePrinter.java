
public class ConsolePrinter {
	private AreaCalculator ac;
	
	public void setAreaCalculator(AreaCalculator ac){
		this.ac = ac;
	}
	
	public void print(){
		System.out.println(ac.getarearesult());
	}
	
}
