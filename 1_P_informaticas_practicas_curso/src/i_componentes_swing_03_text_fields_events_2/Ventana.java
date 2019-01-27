package i_componentes_swing_03_text_fields_events_2;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300,100,800,600);
		
		
		add(new Capa_principal());
				
		
		setVisible(true);
	}
}	
