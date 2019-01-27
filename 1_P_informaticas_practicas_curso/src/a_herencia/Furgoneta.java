package a_herencia;

public class Furgoneta extends Coche {
	private int capacidad_extra;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_extra) {
		super();//constructor de la clase que hereda
		this.plazas_extra = plazas_extra;
		this.capacidad_extra = capacidad_extra;
	}
	
	public int getCapacidad_extra() {
		return capacidad_extra;
	}
}
