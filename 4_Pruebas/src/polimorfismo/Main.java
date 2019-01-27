package polimorfismo;

public class Main {

	public static void main(String[] args) {

		Persona[] profesores = new Persona[5];

//		Profesor_ingles agustin = new Profesor_ingles();
//		Profesor_frances nancy = new Profesor_frances();
//		
//		profesores[0]= agustin;
//		profesores[1]= nancy;

		profesores[0] = new Profesor_ingles();
		profesores[1] = new Profesor_frances();
		profesores[2] = new Persona();

		profesores[0].saludo();
		profesores[1].saludo();

		
		Una_interface[] array = new Una_interface[5];
		
		array[0] = new Profesor_ingles();
		array[1] = new Profesor_frances();


	}

}
