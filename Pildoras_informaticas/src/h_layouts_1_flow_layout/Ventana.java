package h_layouts_1_flow_layout;

import javax.swing.*;

public class Ventana extends JFrame {
	public Ventana() {
		setBounds(100,100,800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Capa_1());
		
		
		setVisible(true);
	}
}
