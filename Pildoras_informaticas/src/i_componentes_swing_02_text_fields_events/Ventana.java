package i_componentes_swing_02_text_fields_events;

import javax.swing.*;

public class Ventana extends JFrame {
	public Ventana() {
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Main_layer());
		
		
		setVisible(true);
	}
}
