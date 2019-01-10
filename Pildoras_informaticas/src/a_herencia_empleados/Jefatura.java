package a_herencia_empleados;

public class Jefatura extends Empleado {
	private double incentivo;
	
	public Jefatura() {
		
	}
	
	public Jefatura (String nombre, double sueldo, int año, int mes, int dia) {
		super(nombre, sueldo, año, mes, dia);
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
