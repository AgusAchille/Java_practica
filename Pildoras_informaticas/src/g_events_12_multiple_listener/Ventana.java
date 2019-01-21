package g_events_12_multiple_listener;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setBounds(500,100,600,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Capa_1());
		
		setVisible(true);
	}
}
