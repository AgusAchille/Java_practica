package z_template;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(200,200,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add(new Capa_principal());
		
		setVisible(true);
	}
}
