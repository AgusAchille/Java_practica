package interfaces_II;

public class Main {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("ramiro", 5600, 2, 8, 1985);
		Jefatura j1 = new Jefatura("patricio", 4522.25, 2, 11, 1995);
		
		System.out.println(j1.tomar_decisiones("Comprar fernet"));

	}

}
