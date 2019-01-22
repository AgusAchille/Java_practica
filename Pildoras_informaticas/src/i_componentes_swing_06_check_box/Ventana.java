package i_componentes_swing_06_check_box;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(200,200,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add(new Capa_principal());
		
		setVisible(true);
	}
}
