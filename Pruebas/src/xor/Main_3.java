package xor;

import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) {
		// 00000000 => 00 => Negro
		// 00000100 => 04 => Rojo
		// 00010000 => 16 => Azul
		// 00010100 => 20 => Rojo y Azuñ

		int num = 0;
		

		while (true) {
			num ^= new Scanner(System.in).nextInt();
				
			mostrar_color(num);
		}

	}

	public static void mostrar_color(int color) {
		switch (color) {
		case 0:
			System.out.println("Negro");
			break;
		case 4:
			System.out.println("Rojo");
			break;
		case 16:
			System.out.println("Azul");
			break;
		case 4 + 16:
			System.out.println("Rojo y Azul");
		}
	}
}
