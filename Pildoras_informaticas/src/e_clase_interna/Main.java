package e_clase_interna;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		Reloj mi_reloj = new Reloj(1000, true);
		
		mi_reloj.en_marcha();
		JOptionPane.showMessageDialog(null, "hola");
		
		System.exit(0);
	}

}
