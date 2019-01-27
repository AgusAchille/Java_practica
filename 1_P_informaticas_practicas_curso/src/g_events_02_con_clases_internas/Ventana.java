package g_events_02_con_clases_internas;

import java.awt.*;

import javax.swing.*;

public class Ventana extends JFrame{
	Capa_1 capa_1 = new Capa_1();
	
	public Ventana() {
		//setUndecorated(true);
		
		setSize(800, 600);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(capa_1);

		setVisible(true);
	}
}