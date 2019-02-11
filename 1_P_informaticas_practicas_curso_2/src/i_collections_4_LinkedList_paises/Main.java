package i_collections_4_LinkedList_paises;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		ListIterator<String> iterator_paises;
		ListIterator<String> iterator_capitales;
		
		paises.add("Argentina");
		paises.add("España");
		paises.add("Italia");
		paises.add("Australia");
		paises.add("Inglaterra");
		
		capitales.add("Buenos Aires");
		capitales.add("Madrid");
		capitales.add("Roma");
		capitales.add("Sidney");
		capitales.add("Londres");
		
		iterator_paises = paises.listIterator();
		iterator_capitales = capitales.listIterator();
		
		//intercalo las listas agregando las capitales a la lista de países
		while(iterator_paises.hasNext()) {
			iterator_paises.next();
			iterator_paises.add(iterator_capitales.next());
		}
						
		//Eliminar los elementos pares de la lista de capitales
		iterator_capitales = capitales.listIterator();
		while(iterator_capitales.hasNext()) {
			iterator_capitales.next();
			
			if(iterator_capitales.hasNext()) {
				iterator_capitales.next();
				iterator_capitales.remove();				
			}
		}
		
		System.out.println(paises);
		System.out.println(capitales);
		
		//Eliminar los elementos los elementos de capitales que aparecen en paises
		paises.removeAll(capitales);
		System.out.println(paises);
		
	}

}

