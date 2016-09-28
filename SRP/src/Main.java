
public class Main {
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(100,200);
		
		Circle c1 = new Circle(20);
		
		Triangle t1 = new Triangle(10,20);
		
		AreaSumCalculator ac = new AreaSumCalculator();
		ac.addShapes(r1);
		ac.addShapes(r2);
		ac.addShapes(c1);
		ac.addShapes(t1);
		ac.calculate();
		
		ConsolePrinter cp = new ConsolePrinter();
		cp.setAreaCalculator(ac);
		cp.print();
		
	}
}
