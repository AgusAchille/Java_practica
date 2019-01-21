package g_events_07_mouse;

import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame{
	public Ventana() {
		setVisible(true);
		
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new Capa_1());
	}
	
	
}
