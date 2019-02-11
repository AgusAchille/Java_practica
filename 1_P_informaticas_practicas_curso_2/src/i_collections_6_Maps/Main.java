package i_collections_6_Maps;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Empleado> map_empleados = new HashMap<String, Empleado>();
		
		map_empleados.put("125", new Empleado("Agustín"));
		map_empleados.put("126", new Empleado("Nancy"));
		map_empleados.put("135", new Empleado("Ana"));
		map_empleados.put("137", new Empleado("Facundo"));
		
		System.out.println(map_empleados);
		
		System.out.println(map_empleados.get("126"));
		
		map_empleados.remove("135");
		
		System.out.println(map_empleados);
		
		//----------------------------------------------
		//entrySet() me devuelve un Set de Map.Entry<K, V>
		Set< Map.Entry<String, Empleado> > set_map_empleados = map_empleados.entrySet();
		
		//Recorro el Set
		for( Map.Entry<String, Empleado> entry : set_map_empleados) {
			String clave = entry.getKey();
			Empleado valor = entry.getValue();
			System.out.println("Clave: " + clave + " Valor: " + valor);
		}
	}
}
