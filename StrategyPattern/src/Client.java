
public class Client {

	
	public static void main(String args[]){
		Robot taekwonV = new TaekwonV("TaeKownV");
		Robot atom = new Atom("Atom");
		Robot sungard = new Sungard("Sungard");
		
		System.out.println("My name is "+ taekwonV.getName());
		taekwonV.setAttackStrategy(new Missile());
		taekwonV.setMovingStrategy(new Walking());
		taekwonV.attack();
		taekwonV.move();
		
		System.out.println();
		
		System.out.println("My name is "+ atom.getName());
		atom.setAttackStrategy(new Punch());
		atom.setMovingStrategy(new Flying());
		atom.attack();
		atom.move();
		

		System.out.println();
		
		System.out.println("My name is "+ sungard.getName());
		sungard.setAttackStrategy(new Missile());
		sungard.setMovingStrategy(new Flying());
		sungard.attack();
		sungard.move();
		
	}
}
