package d_sort_object_array;

public class Futbolista implements Comparable<Futbolista>{
	private String nombre;
	private double sueldo;
	
	public Futbolista(String nombre, int sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String toString() {
		return nombre + ", sueldo: $" + sueldo;
	}

	@Override
	public int compareTo(Futbolista futbolista) {		
		
		return Double.compare(sueldo, futbolista.sueldo);
		
		/* Si a Comparable no se le para el parámetro Futbolista
		 * Entonces el Override del compareTo tiene que tener un argumento Object
		 * y se vuelve necesario tener que hacer un casting

		Futbolista f = (Futbolista) o;	
		return Double.compare(sueldo, f.sueldo);
		
		*/
		
		
		/* Implementación manual
		 * En caso de no existir algo como el Double.compare

		if (sueldo > f.sueldo)
			return 1;
		else if (f.sueldo > sueldo)
			return -1;
		else
			return 0;
		
		*/
	}
}