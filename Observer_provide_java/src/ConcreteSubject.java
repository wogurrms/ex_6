import java.util.Observable;

public class ConcreteSubject extends Observable{
	private String name;
	private float price;
	
	public ConcreteSubject(String name, float price){
		this.name = name;
		this.price = price;
		System.out.println("Concrete Subject Created : "+name+" at "+price);
	}
	
	public String getName(){
		return this.name;
	}
	
	public float getPrice(){
		return this.price;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

	public void setPrice(float price) {
		this.price = price;
		setChanged();
		notifyObservers();
	}
	
	
	

}
