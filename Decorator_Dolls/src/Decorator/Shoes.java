package Decorator;

public class Shoes extends DecoDoll{
	
	public Shoes(Dolls basic) {
		// TODO Auto-generated constructor stub
		super(basic);
	}
	
	public int getPrice(){
		price = super.getPrice();
		return 5000+price;
	}

}
