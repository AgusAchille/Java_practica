package h_threads_1;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Layer_ball extends JPanel{
	private ArrayList<Ball> arr_list_balls = new ArrayList<Ball>();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for (Ball ball : arr_list_balls) {
			g2.fill(ball.getShape());
		}
	}
	
	// Añade pelota y la bota 3000 veces
	public void startGame() {
		Ball ball = new Ball();
		arr_list_balls.add(ball);
		
		for (int i = 1; i <= 1000; i++) {
			ball.mueve_pelota(getBounds());
			paint(getGraphics());
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}