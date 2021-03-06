package b_exceptions_3;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("¿Qué deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
				
		int decision = input.nextInt();
		
		if (decision==1)
			pedirDatos();
		else{
			System.out.println("Adios");
			System.exit(0);
		}
		input.close();
	}
	
	static void pedirDatos() throws InputMismatchException {			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		int edad=entrada.nextInt();		
		
		System.out.println("Hola " + nombre_usuario
				+ ". El año que viene tendras " + (edad+1) + " años");
		
		entrada.close();
		
		System.out.println("Hemos terminado");
	}			
}