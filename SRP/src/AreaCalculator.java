import java.util.ArrayList;
import java.util.Iterator;

abstract public class AreaCalculator {
	protected ArrayList<Shape> shapes = new ArrayList<Shape>();
	protected double arearesult;
	
	public void calculate(){
		setarearesult();
		Iterator<Shape> iter = shapes.iterator();
		while(iter.hasNext()){
			Shape s = iter.next();
			operation(s);
		}
	}
	abstract public void setarearesult();
	abstract public void operation(Shape s);
	public void addShapes(Shape s){
		shapes.add(s);
	}
	
	public double getarearesult(){
		return arearesult;
	}

}
