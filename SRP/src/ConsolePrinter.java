
public class ConsolePrinter {
	private AreaSumCalculator ac;
	
	public void setAreaCalculator(AreaSumCalculator ac){
		this.ac = ac;
	}
	
	public void print(){
		System.out.println(ac.getAreaSum());
	}
	
}
