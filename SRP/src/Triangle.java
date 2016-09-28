
public class Triangle extends Shape{
	private double height;
	private double width; 
	
	public Triangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (this.height * this.width) / 2;
	}

}
