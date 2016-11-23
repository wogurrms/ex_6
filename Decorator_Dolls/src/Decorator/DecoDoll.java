package Decorator;

public abstract class DecoDoll extends Dolls{
	private Dolls basic;
	public DecoDoll(Dolls basic) {
		// TODO Auto-generated constructor stub
		this.basic = basic;
	}
	
	public int getPrice(){
		price = basic.getPrice();
		return price;
	}

}
