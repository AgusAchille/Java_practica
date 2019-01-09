package interfaces_II;

public class Jefatura extends Empleado implements Jefes{
	private double incentivo;
	
	//Constructores
	public Jefatura() {	
	}
	
	public Jefatura (String nombre, double sueldo, int dia, int mes, int a�o) {
		super(nombre, sueldo, a�o, mes, dia);
	}

	//M�todos
		//M�todo de una interface
	public String tomar_decisiones(String decision) {
		return "Se tom� la siguiente decisi�n: " + decision;
		
	}
		//M�todo de una interface heredado de otra interface
	@Override
	public void tomarse_vacaciones() {
		System.out.println("El jefe se tom� vacaciones");;
		
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