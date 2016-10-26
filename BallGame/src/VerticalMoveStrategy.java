
public class VerticalMoveStrategy extends DirectionStrategy{

	@Override
	public void move(Ball ball) {
		ball.setInterval(0,Ball.INTERVAL);
		while(true){
			ball.setY(ball.getY() + ball.getyInterval());
			if((ball.getY() < 0 && ball.getyInterval() < 0) || ball.getY() + Ball.SIZE > BallFrame.HEIGHT - 15 && ball.getyInterval() > 0) {
				ball.setInterval(0,-ball.getyInterval());
			}
			
			try{
				Thread.sleep(30);
			} catch(InterruptedException e) {}
		}
	}
}
