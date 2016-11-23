package Decorator;

public class Ribon extends DecoDoll{

	public Ribon(Dolls basic) {
		// TODO Auto-generated constructor stub
		super(basic);
	}
	
	public int getPrice(){
		price = super.getPrice();
		return 10000+price;
	}

}
