import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {
	private String name;

	public NameObserver() {
		this.name = null;
		System.out.println("NameObserver Created : Name is : "+name);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof String){
			name = ((ConcreteSubject)o).getName();
			System.out.println("NameObserver : Name changed to "+name);
		}else{
			System.out.println("NameObserver : Some other change to subject!");
		}
		
	}
	

}
