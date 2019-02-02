package g_generic_methods_comodin;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Deportista> array = new ArrayList<Deportista>();
		array.add( new Deportista() );
		array.add( new Tenista() );
		////////////////////////////////////
		
		ArrayList<Tenista> array_2 = new ArrayList<Tenista>();
		prueba(array_2);
	}
	
	//Este método puede recibir Arraylist de Deportista y de subclases de Deportista
	static void prueba(ArrayList<? extends Deportista> array) {
		
	}
	
	//Este método solo puede recibir ArrayList de tipo deportista
	static void prueba2(ArrayList<Deportista> array) {
		
	}
	
}

class Deportista{
	
}

class Tenista extends Deportista{
	
}
