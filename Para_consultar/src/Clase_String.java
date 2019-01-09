
public class Clase_String {
	public static void main(String[] args) {
		String nombre = "aguStin";
		String nombre2 = "agustin";
		
		int num;
		char c;

		// length();
		num = nombre.length();		
		System.out.println(num);
		
		// charAt();
		c = nombre.charAt(0);
		System.out.println(c);
		
		//substring
		//El primero es donde empieza, se incluye
		//El segundo hasta donde, no se incluye
		System.out.println(nombre.substring(0, 4));	
		
		if (nombre.equalsIgnoreCase("agustin"))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
	}
	
	//Convierte la primera letra de la palabra a mayúsculas y el resto a minúsculas.
	public static String mayus(String palabra) {
		return palabra.toUpperCase().charAt(0) + palabra.toLowerCase().substring(1);
	}	
}
