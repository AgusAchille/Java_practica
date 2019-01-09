package graf_1_marcos;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
	
		Mi_marco marco1 = new Mi_marco();
		
		marco1.setVisible(true);
		
		//definir que se cierre la aplicación cuando se cierre la ventana
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Ventana_centrada ven_cen = new Ventana_centrada();
		
		ven_cen.setVisible(true);
		ven_cen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
