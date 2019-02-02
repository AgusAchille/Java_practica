package g_generic_methods;

public class Main {

	public static void main(String[] args) {
		
		Integer[] num = {4,6,52,1,3,4,7};
		
		String[] nombres = {"Agus", "Nadia", "Facu", "Jenny", "Alex"};		
		
		
		//A los métodos genéricos no es necesario
		// decirles el tipo de datos
		getElements(num);
		
		
		Main.getElements(num);
		Main.<Integer>getElements(num);
		
		
		
		
	}
	
	static <T> void getElements(T[] array) {
		System.out.println("Tiene " + array.length + " elementos.");
	}
	

}
