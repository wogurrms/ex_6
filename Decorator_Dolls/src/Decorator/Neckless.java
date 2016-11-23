package Decorator;

public class Neckless extends DecoDoll{

	public Neckless(Dolls basic) {
		// TODO Auto-generated constructor stub
		super(basic);
	}
	
	public int getPrice(){
		price = super.getPrice();
		return 20000+price;
	}
}
