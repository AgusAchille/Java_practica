package g_events_9_foco;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setBounds(100,100,500,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Capa_1());
	}
}