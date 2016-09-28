
public class Circle extends Shape{
	private double radius;
	
	public Circle(double length){
		this.radius = length;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.radius * this.radius* 3.14;
	}

}
