package g_events_4_clases_adaptadoras;

import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame{
	private static int sig_num_ventana=1;
	private int num_ventana;
	
	public Ventana() {
		num_ventana = sig_num_ventana;
		sig_num_ventana++;
		setTitle("Ventana " + num_ventana);
		setSize(400, 300);
		setLocation(100+50*num_ventana, 100+50*num_ventana);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowListener(new Ventana_listener());
	}
	
	
	class Ventana_listener extends WindowAdapter{

		@Override
		public void windowActivated(WindowEvent arg0) {
			System.out.println("Se activó la ventana " + num_ventana);
			
		}
	}
}
