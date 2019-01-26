package procesador_de_texto;

import javax.swing.*;


public class Ventana_principal extends JFrame{
	
	public Ventana_principal() {
		setBounds(200, 200, 700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add( new Capa_principal() );
		
		setVisible(true);
	}
}
