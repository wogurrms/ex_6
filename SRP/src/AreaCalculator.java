import java.util.ArrayList;
import java.util.Iterator;

abstract public class AreaCalculator {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double areasum;
	
	abstract public void calculate();
	
	public void addShapes(Shape s){
		shapes.add(s);
	}
	
	public double getAreaSum(){
		return areasum;
	}

}
