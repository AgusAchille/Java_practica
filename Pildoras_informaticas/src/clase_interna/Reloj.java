package clase_interna;

import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

public class Reloj {
	private int intervalo;
	private boolean sonido;

	// Constructor
	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}

	// Métodos
	public void en_marcha() {
		Obtener_hora listener = new Obtener_hora();
		Timer timer = new Timer(intervalo, listener);
		timer.start();
	}

	// Clase Interna. Solo las clases internas pueden ser private

	private class Obtener_hora implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Almacena la hora actual
			Date hora = new Date();
			System.out.println(hora);

			if (sonido == true)
				System.out.println("SONIDOOOO!");
		}
	}
}