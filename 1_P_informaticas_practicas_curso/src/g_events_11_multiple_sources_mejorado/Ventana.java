package g_events_11_multiple_sources_mejorado;

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
