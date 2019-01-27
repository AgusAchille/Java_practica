package g_events_12_multiple_listener;

import javax.swing.*;
import java.awt.event.*;

public class Capa_1 extends JPanel{
	
	JButton btn_new_window = new JButton("Nueva ventana");
	JButton btn_close_windows = new JButton("Cerrar ventanas");
	
	public Capa_1() {
		btn_new_window.addActionListener(new Nueva_ventana());
		add(btn_new_window);
		add(btn_close_windows);
	}
	
	
	private class Nueva_ventana implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new Mini_ventana(btn_close_windows);
		}
	}
	
}


