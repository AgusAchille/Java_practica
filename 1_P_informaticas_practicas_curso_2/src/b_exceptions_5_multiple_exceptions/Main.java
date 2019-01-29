package b_exceptions_5_multiple_exceptions;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		try {		
			int result = divide();
			System.out.println(result);			
		} catch (NumberFormatException e) {
			//Muestra el string ingresado
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}


		System.out.println("El programa terminó bien");
	}
	
	
	public static int divide() {
		int x = Integer.parseInt(JOptionPane.showInputDialog("X:"));
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Y:"));
		
		return x / y;			
	}
}
