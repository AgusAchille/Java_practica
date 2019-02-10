package i_collections_2_HashSet_2_Iterator;

public class Estudiante {
	private static int siguiente_legajo = 1;
	private String name;
	private int legajo;
	private String carrera;
	
	public Estudiante(String name, String carrera) {
		this.name = name;
		this.carrera = carrera;
		legajo = siguiente_legajo;
		siguiente_legajo++;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}	

	
	public String getName() {
		return name;
	}
	public String getCarrera() {
		return carrera;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nLegajo: " + legajo + "\nCarrera: " + carrera +"\n";
	}

	//Métodos que determinan se un objeto Estudiante es el mismo comparando el legajo
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + legajo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Estudiante))
			return false;
		Estudiante other = (Estudiante) obj;
		if (legajo != other.legajo)
			return false;
		return true;
	}
}