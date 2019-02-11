package i_collections_5_TreeSet;

public class Articulo implements Comparable<Articulo>{
	private String name;
	private int numero_articulo;
	
	public Articulo(String name, int numero_articulo) {
		this.name = name;
		this.numero_articulo = numero_articulo;
	}
	
	public int getNumeroArticulo() {
		return numero_articulo;
	}

	@Override
	public int compareTo(Articulo art) {
		return name.compareTo(art.name);
	}

	@Override
	public String toString() {
		return name + "\nNº: " + numero_articulo + "\n";
	}
}