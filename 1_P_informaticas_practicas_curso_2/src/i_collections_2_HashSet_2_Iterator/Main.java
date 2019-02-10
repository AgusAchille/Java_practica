package i_collections_2_HashSet_2_Iterator;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashSet<Estudiante> estudiantes = new HashSet<Estudiante>();
		
		estudiantes.add(new Estudiante("Agustín", "Informática"));
		estudiantes.add(new Estudiante("Nancy", "Informática"));
		estudiantes.add(new Estudiante("Luciano", "Contador"));
		estudiantes.add(new Estudiante("Micaela", "Enfermería"));
		estudiantes.add(new Estudiante("Alejandra", "Abogacía"));
		
		Estudiante est = new Estudiante("Agustín", "Informática");
		est.setLegajo(3);
		estudiantes.add(est);
		
		Iterator<Estudiante> iterator = estudiantes.iterator();
		
		while(iterator.hasNext()) {
			Estudiante other = iterator.next();
			
			if(other.getName().equalsIgnoreCase("luciano"))
				iterator.remove();
		}
		
		for (Estudiante estu : estudiantes)
			System.out.println(estu);		
	}
}
