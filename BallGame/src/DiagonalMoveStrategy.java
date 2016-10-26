
public class DiagonalMoveStrategy  extends DirectionStrategy{

	@Override
	public void move(Ball ball) {
		ball.setInterval(Ball.INTERVAL,Ball.INTERVAL);
		while(true){
			ball.setY(ball.getY() + ball.getyInterval());
			ball.setX(ball.getX() + ball.getxInterval());

			if((ball.getY() < 0 && ball.getyInterval() < 0) || ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getyInterval() > 0 ||
					(ball.getX() < 0 && ball.getxInterval() < 0) || ball.getX() + Ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterval() > 0 ) {
				ball.setInterval(-ball.getxInterval(),-ball.getyInterval());
			}
			
			try{
				Thread.sleep(30);
			} catch(InterruptedException e) {}
		}
	}
	
}
