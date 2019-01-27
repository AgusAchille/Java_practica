package c_p_enum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean ok = true;
		String entrada;
		Talla2 talla = null;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Escribe una talla: mini, mediano, grande, muy grande");
			ok = true;
			entrada = sc.nextLine().toUpperCase();
			if (entrada.equalsIgnoreCase("muy grande"))
				entrada = "MUY_GRANDE";

			try {
				talla = Enum.valueOf(Talla2.class, entrada);
			} catch (Exception e) {
				System.out.println("Opción incorrecta");
				ok = false;
			}
		} while (ok == false);

		System.out.println(talla.getAbreviatura());

	}
}
