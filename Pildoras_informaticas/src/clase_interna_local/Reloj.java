package clase_interna_local;

import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

public class Reloj {

	// Métodos
	public void en_marcha(int intervalo, boolean sonido) {
		
		//Clase interna local
		class Obtener_hora implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Imprime la hora actual
				System.out.println(new Date());
				
				if (sonido)
					System.out.println("SONIDOOOOS!");
			}
		}
		
		Timer timer= new Timer(intervalo, new Obtener_hora());
		timer.start();
	}
}