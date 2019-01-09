package graf_4_2D;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Ventana extends JFrame {

	public Ventana() {
		setVisible(true);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new Capa1());
	}

}

class Capa1 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2D = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2D.draw(rectangulo);

		Ellipse2D circulo = new Ellipse2D.Double();

		double radio = Math.hypot(200, 150) / 2;
		circulo.setFrameFromCenter(200, 175, 200 + radio, 175 + radio);
		g2D.draw(circulo);

		g2D.draw(new Line2D.Double(100, 100, 300, 250));

	}
}
