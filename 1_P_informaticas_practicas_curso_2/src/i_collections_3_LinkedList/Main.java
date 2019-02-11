package i_collections_3_LinkedList;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		ListIterator<String> iterator;
		
		lista.add("Cámara");
		lista.add("Lente");
		lista.add("Tarjeta");
		lista.add("Batería");
		
		iterator = lista.listIterator();
		while(iterator.hasNext()) {
			String aux = iterator.next();
			
			//Agregar elemento antes de cámara
			if(aux.equalsIgnoreCase("cámara")) {
				iterator.previous();
				iterator.add("Trípode");
				iterator.next();
			}
			
		}
		
		
		
		for (String elemento : lista)
			System.out.println(elemento);
		
		
		
		
	}

}
