package j_advanced_layouts_3_fix_spring;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(200,200,800,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		add(new Capa_principal());
		
		setVisible(true);
	}
}
