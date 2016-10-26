
public abstract class Robot {
	private String name;
	private MovingStrategy movingstrategy;
	private AttackStrategy attackstrategy;
	
	
	public Robot(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setAttackStrategy(AttackStrategy attackstrategy){
		this.attackstrategy = attackstrategy; 
	}
	public void setMovingStrategy(MovingStrategy movingstrategy){
		this.movingstrategy = movingstrategy;
	}
	
	public  void attack(){
		attackstrategy.attack();
	}
	public  void move(){
		movingstrategy.move();
	}

}
