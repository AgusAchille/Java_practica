package d_sort_object_array;

public class Futbolista implements Comparable{
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
	public int compareTo(Object o) {		
		Futbolista f = (Futbolista) o;
				
		return Double.compare(sueldo, f.sueldo);
		
		/*Implementación manual

		if (sueldo > f.sueldo)
			return 1;
		else if (f.sueldo > sueldo)
			return -1;
		else
			return 0;
		
		*/
	}
}