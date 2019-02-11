package i_collections_6_Maps;

public class Empleado {
	private String name;
	private double sueldo;
	
	public Empleado(String name) {
		this.name = name;
		if(name.equalsIgnoreCase("agustín")
				|| name.equalsIgnoreCase("nancy"))
			sueldo = 100000;
		else
			sueldo = 15000;
	}
	
	public String toString() {
		return name + ", Sueldo: " + sueldo + "\n";
	}
	
}
