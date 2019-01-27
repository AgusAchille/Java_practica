package f_graf_6_fonts;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setVisible(true);
		setSize(800,600);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Capa_1());
		
	}

}
