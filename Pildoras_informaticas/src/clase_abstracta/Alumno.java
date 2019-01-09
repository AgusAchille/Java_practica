package clase_abstracta;

public class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nombre, String carrera) {
		super(nombre);
	}
	
	public String descripcion() {
		return "Esta es la descripcion";
	}

}
