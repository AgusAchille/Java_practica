package g_events_a1_foco_ventana;

import java.awt.event.*;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setVisible(true);
		setBounds(100, 100, 500, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowFocusListener(new Focus_w_listener());
		
	}
	
	class Focus_w_listener implements WindowFocusListener{
		@Override
		public void windowGainedFocus(WindowEvent e) {
			setTitle("En Foco");
		}

		@Override
		public void windowLostFocus(WindowEvent e) {
			setTitle("");
		}	
	}
}
