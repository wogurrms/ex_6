
public class Client {
	private static final int INIT_LOCATION[] = {50,100,150};
	private static final DrawStrategy INIT_DRAW[] = {new RedDrawStrategy(),new BlueDrawStrategy(), new YellowDrawStrategy()};
	private static final DirectionStrategy INIT_DIRECTION[] = {new HorizonalMoveStrategy(),new VerticalMoveStrategy(), new DiagonalMoveStrategy()};
	public static void main(String args[]){
		Ball [] balls = new Ball[3];
		for( int i = 0 ; i< balls.length; i++ ) {
			balls[i] = new Ball(INIT_LOCATION[i] , INIT_LOCATION[i]);
			balls[i].setDirectionstrategy(INIT_DIRECTION[i]);
			balls[i].setDrawstrategy(INIT_DRAW[i]);
			
			balls[i].start();
		}
		
		new BallFrame(balls);
	}

}
