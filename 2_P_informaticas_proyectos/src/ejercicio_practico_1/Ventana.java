package ejercicio_practico_1;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(300,300,600,450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add( new Main_layer() );
		
		setVisible(true);
	}
	
}
