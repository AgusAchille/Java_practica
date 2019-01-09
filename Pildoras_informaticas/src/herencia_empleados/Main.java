package herencia_empleados;

public class Main{
	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Agustin", 95000, 6, 10, 1990);
		Jefatura jefe1 = new Jefatura("Fernando", 150000, 6, 10, 1990);
		
		jefe1.setIncentivo(5000);
		
		System.out.println(jefe1.getSueldo());
		jefe1.aumentar_sueldo(10);
		System.out.println(jefe1.getSueldo());
		
		//Polimorfismo
		
		Empleado[] empleados = new Empleado[5];
		empleados[0] = new Jefatura();
		empleados[0].setSueldo(5000);
		
		System.out.println(empleados[0].getSueldo());
		
		Jefatura aux = (Jefatura) empleados[0];
		aux.setIncentivo(3000);
		
		System.out.println(empleados[0].getSueldo());
		
	}
}