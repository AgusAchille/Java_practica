package clase_interna_local;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		Reloj mi_reloj = new Reloj();
		mi_reloj.en_marcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "hola");
		
		System.exit(0);
	}

}
