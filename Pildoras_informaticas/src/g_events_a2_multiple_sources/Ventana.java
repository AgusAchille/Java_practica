package g_events_a2_multiple_sources;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Capa_1());
		
		//hacer visible
		setVisible(true);
	}
}
