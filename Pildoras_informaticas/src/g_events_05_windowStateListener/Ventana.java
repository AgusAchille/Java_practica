package g_events_05_windowStateListener;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
	private static int sig_num_ventana = 1;
	private int num_ventana;

	public Ventana() {
		num_ventana = sig_num_ventana;
		sig_num_ventana++;
		setTitle("Ventana " + num_ventana);
		setSize(400, 300);
		setLocation(100 + 50 * num_ventana, 100 + 50 * num_ventana);
		setVisible(true);

		addWindowStateListener(new Ventana_listener());
	}

	class Ventana_listener implements WindowStateListener {

		@Override
		public void windowStateChanged(WindowEvent e) {

			switch (e.getNewState()) {
				case Frame.NORMAL:
					System.out.println("La ventana " + num_ventana +" se encuentra en estado normal");
					break;
				case Cursor.NE_RESIZE_CURSOR:
					System.out.println("La ventana " + num_ventana +" se minimizó estando maximizada");
					break;
				case Frame.ICONIFIED:
					System.out.println("La ventana " + num_ventana +" se minimizó");
					break;
			
				case Frame.MAXIMIZED_BOTH:
					System.out.println("La ventana " + num_ventana +" maximizó");
					break;
				default:
					System.out.println(e.getNewState());

			}

		}
	}
}
