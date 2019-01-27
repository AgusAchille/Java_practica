package polimorfismo;

public class Profesor_ingles extends Persona implements Una_interface{
	
	
	@Override
	public void saludo() {
		System.out.println("Hello!");
	}
	
}
