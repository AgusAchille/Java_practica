package graf_3_marcos;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana() {
		setSize(800,600);
		setLocation(320,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Capa1 capa1 = new Capa1();
		
		add(capa1);
		
	}

}
