package h_threads_1;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Ball {
	private static final int TAMX = 15;
	private static final int TAMY = 15;
	private double x = new Random().nextInt(300)+1;
	private double y = new Random().nextInt(300)+1;
	private double dx = 3;
	private double dy = 3;
	
	// Mueve la pelota invirtiendo posición si choca con límites
	public void mueve_pelota(Rectangle2D limits) {
		x += dx;
		y += dy;
		
		if (x < limits.getMinX()) {
			x = limits.getMinX();
			dx = -dx;
		}
		
		if (x + TAMX >= limits.getMaxX()) {
			x = limits.getMaxX() - TAMX;
			dx = -dx;
		}
		
		if (y < limits.getMinY()) {
			y = limits.getMinY();
			dy = -dy;
		}
		
		if (y + TAMY >= limits.getMaxY()) {
			y = limits.getMaxY() - TAMY;
			dy = -dy;
		}
	}

	// Forma de la pelota en su posición inicial
	public Ellipse2D getShape() {
		return new Ellipse2D.Double(x, y, TAMX, TAMY);
	}
}
