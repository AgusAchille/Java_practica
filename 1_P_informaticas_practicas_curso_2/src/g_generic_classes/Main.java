package g_generic_classes;

public class Main {

	public static void main(String[] args) {
		ArrayListAgus<String> array = new ArrayListAgus<String>(4);
		
		array.add("Agus   ");
		array.add("Nan");
		array.add("Patricio");
		array.add("Cris");
		
		String s = array.get(0).trim();
		
		System.out.println(s);
		

	}

}
