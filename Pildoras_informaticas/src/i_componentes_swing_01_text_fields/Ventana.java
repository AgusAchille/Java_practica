package i_componentes_swing_01_text_fields;

import java.awt.*;

import javax.swing.*;

public class Ventana extends JFrame {
	public Ventana() {
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add(new Capa_1());
		
		setVisible(true);
	}
}


