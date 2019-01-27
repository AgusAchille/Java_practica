package e_clase_interna_agus;

import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

public class Reloj {
	private boolean sonido;
	private Timer timer;

	// Constructor
	public Reloj(int intervalo, boolean sonido) {
		this.sonido = sonido;
		timer = new Timer(intervalo, new Obtener_hora());
	}

	// Métodos
	public void en_marcha() {
		timer.start();
	}

	// Clase Interna. Solo las clases internas pueden ser private

	public class Obtener_hora implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Almacena la hora actual
			Date hora = new Date();
			System.out.println(hora);

			if (sonido == true)
				System.out.println("SONIDOOOOS!");
		}
	}
}