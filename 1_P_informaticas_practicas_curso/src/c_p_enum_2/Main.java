package c_p_enum_2;

public class Main {
	private enum Dias {
		DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO 
	}
	public static void main(String[] args) {
		
		
		Dias dia = Dias.MARTES;		
		
		switch(dia) {
			case LUNES:
				System.out.println("lunes");
				break;
			case MARTES:
				System.out.println("martes");
		}
		
		

	}
	
	

}
