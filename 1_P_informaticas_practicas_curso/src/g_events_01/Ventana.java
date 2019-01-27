package g_events_01;

import java.awt.*;

import javax.swing.*;

public class Ventana extends JFrame{
	Capa_1 capa_1 = new Capa_1();
	
	public Ventana() {
		setSize(800, 600);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		add(capa_1);
	}
}