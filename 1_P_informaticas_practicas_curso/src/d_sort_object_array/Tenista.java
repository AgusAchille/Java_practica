package d_sort_object_array;

public class Tenista implements Comparable<Tenista> {
	private String nombre;
	private int sueldo;

	public Tenista(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public String toString() {
		return nombre + ", sueldo: $" + sueldo;
	}

	@Override
	public int compareTo(Tenista t) {
		
		//Compara los sueldos
		int compare = Integer.compare(sueldo, t.sueldo);
		
		//Si los sueldos son iguales
		if (compare == 0)
			//Compara los nombres
			return nombre.compareTo(t.nombre);
		else 
			return compare;
	}
}
