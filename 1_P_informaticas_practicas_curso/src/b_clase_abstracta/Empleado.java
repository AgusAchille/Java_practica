package b_clase_abstracta;

import java.util.*;

public class Empleado extends Persona{
	private double sueldo;
	private Date fecha_nacimiento;
	private int id;
	private static int id_siguiente=1;

	// Constructores
	public Empleado() {
		id = id_siguiente++; // primero le asigna el valor a id y luego incrementa id_siguiente en 1
		System.out.println(id); 
	}
	
	public Empleado(String nombre, double sueldo, int dia, int mes, int año) {
		super(nombre);
		
		id = id_siguiente++; // primero le asigna el valor a id y luego incrementa id_siguiente en 1
		
		this.sueldo = sueldo;
		GregorianCalendar calendar = new GregorianCalendar(año, mes - 1, dia);
		fecha_nacimiento = calendar.getTime();
	}
	
	//M�todos
	public String descripcion() {
		return "ID del empleado: " + id;
	}
	
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
