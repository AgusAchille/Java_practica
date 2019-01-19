package g_events_8_mouse_motion_drag;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Ventana extends JFrame{

	
	public Ventana() {
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(new Capa_1());
	}
	
}