import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

public class Field extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	private Ball[] balls;
	private Graphics2D grp;
	public Field(Ball[] balls){
		this.balls = balls;
		setLayout(new FlowLayout());
	}
	public void paint(Graphics g){
		g.clearRect(0, 0, BallFrame.WIDTH, BallFrame.HEIGHT);
		for(int i = 0 ; i < balls.length ; i++){
			g.setColor(balls[i].getColor());
			g.fillOval(balls[i].getX(), balls[i].getY(), Ball.SIZE, Ball.SIZE);
			grp = (Graphics2D)g;
			Stroke strk;
			strk = grp.getStroke();
			strk.createStrokedShape(getBounds());
			grp.setStroke(strk);
		}
	}
	
	@Override
	public void run() {
		while(true){
			repaint();
			try{
				Thread.sleep(5);
			}catch (InterruptedException e){}
		}
	}

}
