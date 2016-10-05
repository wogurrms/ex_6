import java.util.ArrayList;
import java.util.Iterator;

public class AreaSumCalculator extends AreaCalculator{
	

	public void setarearesult(){
		arearesult = 0.0;
	}
	
	public void operation(Shape s){
		arearesult += s.area();
	}

}
