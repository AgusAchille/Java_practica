package i_collections_5_TreeSet;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		TreeSet<String> arbol_nombres = new TreeSet<String>();
		TreeSet<Articulo> arbol_articulos = new TreeSet<Articulo>();
		
		//Se le pasa por argumento una Comparator para cambiar el criterio de ordenación
		TreeSet<Articulo> arbol_articulos_2 = new TreeSet<Articulo>(new OrdenarPorNumero());
		
		arbol_nombres.add("Nancy");
		arbol_nombres.add("Agustín");
		arbol_nombres.add("Fabián");
		arbol_nombres.add("Chino");
		arbol_nombres.add("Micaela");
		
		System.out.println(arbol_nombres);
		
		//---------------------------------------------------------------		
		arbol_articulos.add(new Articulo("Taza", 9));
		arbol_articulos.add(new Articulo("Vaso", 3));
		arbol_articulos.add(new Articulo("Tenedor", 7));
		arbol_articulos.add(new Articulo("Guitarra", 14));
		arbol_articulos.add(new Articulo("Computadora", 25));		
		
		System.out.println("\nPor orden alfabético:");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		for (Articulo art : arbol_articulos)
			System.out.println(art);
		
		//---------------------------------------------------------------
		arbol_articulos_2.add(new Articulo("Taza", 9));
		arbol_articulos_2.add(new Articulo("Vaso", 3));
		arbol_articulos_2.add(new Articulo("Tenedor", 7));
		arbol_articulos_2.add(new Articulo("Guitarra", 14));
		arbol_articulos_2.add(new Articulo("Computadora", 25));		
		
		System.out.println("Por número:");
		System.out.println("¯¯¯¯¯¯¯¯¯¯");
		for (Articulo art : arbol_articulos_2)
			System.out.println(art);
		
	}	
}

class OrdenarPorNumero implements Comparator<Articulo>{
	@Override
	public int compare(Articulo art_1, Articulo art_2) {
		return Integer.compare(art_1.getNumeroArticulo(), art_2.getNumeroArticulo());
	}	
}