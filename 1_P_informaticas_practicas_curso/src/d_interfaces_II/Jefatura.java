package d_interfaces_II;

public class Jefatura extends Empleado implements Jefes{
	private double incentivo;
	
	//Constructores
	public Jefatura() {	
	}
	
	public Jefatura (String nombre, double sueldo, int dia, int mes, int año) {
		super(nombre, sueldo, año, mes, dia);
	}

	//Métodos
		//Método de una interface
	public String tomar_decisiones(String decision) {
		return "Se tomó la siguiente decisión: " + decision;
		
	}
		//Método de una interface heredado de otra interface
	@Override
	public void tomarse_vacaciones() {
		System.out.println("El jefe se tomó vacaciones");;
		
	}
	
	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() + incentivo;
	}

	
	
}
