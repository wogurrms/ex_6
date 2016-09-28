import java.util.ArrayList;
import java.util.Iterator;

public class AreaProdCalculator extends AreaCalculator{
	
	public void calculate(){
		Iterator<Shape> iter = shapes.iterator();
		areasum = 1.0;
		while(iter.hasNext()){
			Shape s = iter.next();
			areasum *= s.area();
		}
		
	}

}
