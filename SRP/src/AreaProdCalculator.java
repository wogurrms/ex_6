import java.util.Iterator;

public class AreaProdCalculator extends AreaCalculator{
	
	public void setarearesult(){
		arearesult = 1.0;
	}
	
	public void operation(Shape s){
		arearesult *= s.area();
	}

}
