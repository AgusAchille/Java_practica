package b_exceptions_4_excepcion_propia;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		int edad;

		edad = Integer.parseInt(JOptionPane.showInputDialog("edad"));

		try {
			entrada(edad);
		} catch (MyException e) {
			System.out.println("Te cach� :D");
		}

		System.out.println("El programa terminó bien");
	}

	public static void entrada(int edad) throws MyException {

		if (edad >= 18) {
			System.out.println("Podes entrar");
		} else {
			throw new MyException("Menor de edad");
		}

	}
}
