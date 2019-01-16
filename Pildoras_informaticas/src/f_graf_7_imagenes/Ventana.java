package f_graf_7_imagenes;

import javax.swing.*;

public class Ventana extends JFrame{
	public Ventana() {
		setVisible(true);
		setBounds(200, 200, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Imágenes");
		
		add(new Capa_1());
	}
		
}
