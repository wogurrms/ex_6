import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {
	private float price;

	public PriceObserver() {
		price = 0;
		System.out.println("PriceObserver created: Price is " + price);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof Float){
			price = ((Float)arg).floatValue();
			System.out.println("PriceObserver: Price changed to " +	price);
		}else{
			System.out.println("PriceObserver: Some other change to subject!");
		}
	}

}
