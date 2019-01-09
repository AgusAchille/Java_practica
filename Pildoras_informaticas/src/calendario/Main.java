package calendario;

public class Main{
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Agustin", 95000, 6, 10, 1990);
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado("Agustin", 95000, 6, 10, 1990);	
		
		empleado1.setFecha_nacimiento(06, 10, 1990);
		
		
		System.out.println(empleado1.getFecha_nacimiento());
		
		System.out.println(empleado1.getSueldo());
		empleado1.aumentar_sueldo(50);
		System.out.println(empleado1.getSueldo());
		
	}
}