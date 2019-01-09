package graf_3_marcos;

import javax.swing.*;
import java.awt.*;

public class Capa1 extends JPanel{
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);
		g.drawLine(100,100,200,300);
	}
}
