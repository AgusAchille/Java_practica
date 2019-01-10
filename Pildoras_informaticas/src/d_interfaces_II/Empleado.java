package d_interfaces_II;

import java.util.*;

public class Empleado {
	private String nombre;
	private double sueldo;
	private Date fecha_nacimiento;
	private int id;
	private static int id_siguiente=1;

	// Constructores
	
	public Empleado() {
		id = id_siguiente++; // primero le asigna el valor a id y luego incrementa id_siguiente en 1
	}
	
	public Empleado(String nombre, double sueldo, int dia, int mes, int año) {
		id = id_siguiente++; // primero le asigna el valor a id y luego incrementa id_siguiente en 1
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
		fecha_nacimiento = calendar.getTime();
	}
	
	//Métodos
	public void setFecha_nacimiento(int dia, int mes, int año) {
		GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
		fecha_nacimiento = calendar.getTime();
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	
	public int getId() {
		return id;
	}
	
	public void aumentar_sueldo(double porcentaje) {
		sueldo *= porcentaje/100 + 1;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
}
