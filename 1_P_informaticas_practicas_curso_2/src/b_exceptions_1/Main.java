package b_exceptions_1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int[] my_array = new int[5];

		my_array[0] = 5;
		my_array[1] = 35;
		my_array[2] = -15;
		my_array[3] = 92;
		my_array[4] = 71;

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println("Posici�n" + i + "=" + my_array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problemas con el Array");
		}

		// ----------------------------------------------------------

		String name;
		do {
			name = JOptionPane.showInputDialog("Introduce your name: ");
		} while (name == null);

		try {
			int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce your age: "));
			System.out.println("Hola " + name + " tienes " + age + " a�os");
		} catch (NumberFormatException e) {
			System.out.println("Introduce solo n�meros por favor");
		}

	}

}
