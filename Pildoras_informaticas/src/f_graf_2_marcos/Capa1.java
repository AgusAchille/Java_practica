package f_graf_2_marcos;

import java.awt.*;
import javax.swing.*;

public class Capa1 extends JPanel{
	
	private String s;
	


	private int x, y;
	
	public Capa1(String s, int x, int y) {
		super();
		this.s = s;
		this.x = x;
		this.y = y;
	}

	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(s, x, y);		
	}
}
