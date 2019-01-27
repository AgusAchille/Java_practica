package a_herencia;

public class Main {

	public static void main(String[] args) {
		Coche mi_coche = new Coche();
		
		mi_coche.setColor("verde");
		
		Furgoneta mi_furgoneta = new Furgoneta(7, 580);
		
		mi_furgoneta.setColor("amarilla");
		
		mi_furgoneta.setAsientos_cuero("si");
		mi_furgoneta.setClimatizador("si");
		
		System.out.println(mi_furgoneta.getAsientos_cuero());
		System.out.println(mi_furgoneta.getClimatizador());
		
		System.out.println(mi_furgoneta.getRuedas());
	}

}
