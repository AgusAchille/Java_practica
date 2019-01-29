package exceptions;

public class Main {
	public static void main(String [] args) {

			try {
				saludo(17);
			} catch (MiExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		
		System.out.println("Agus");
	}
	
	public static void saludo(int edad) throws MiExcepcion {
		
		if(edad >= 18) {
			System.out.println("hola cómo estas?");
		} else {
			throw new MiExcepcion("Menor de edad");
		}
		
	}
}
