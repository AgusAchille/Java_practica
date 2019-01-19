package g_events_3_eventos_ventanas;

import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame {
	private static int sig_num_ventana=1;
	private int num_ventana;
	
	public Ventana() {
		num_ventana = sig_num_ventana;
		sig_num_ventana++;
		setTitle("Ventana " + num_ventana);
		setVisible(true);
		
		// el código extra es para que las ventanas aparezcan desplazadas
		// según el numero de ventana
		setBounds(100+50*num_ventana, 100+50*num_ventana, 400, 300);
		
		// Solo la primer ventana va a cerrar todas las ventanas cuando se cierre
		if (num_ventana == 1)
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		else
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Ventana_listener vent_list = new Ventana_listener();
		addWindowListener(vent_list);

	}

	class Ventana_listener implements WindowListener {
		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("Ventana " + num_ventana + " activada");
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("La ventana " + num_ventana + " ha sido cerrada");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("Cerrando la ventana "+ num_ventana);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Ventana " + num_ventana + " desactivada");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Ventana " + num_ventana + " maximizada");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("Ventana " + num_ventana + " minimizada");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("Se abrió la ventana "+ num_ventana);
		}
	}
}