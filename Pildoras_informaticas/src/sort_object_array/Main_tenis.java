package sort_object_array;

import java.util.Arrays;

public class Main_tenis {

	public static void main(String[] args) {
		Tenista[] tenistas = new Tenista[5];
		
		tenistas[0] = new Tenista("Pablo", 9000);
		tenistas[1] = new Tenista("Patricio", 15000);
		tenistas[2] = new Tenista("Cristina", 7000);
		tenistas[3] = new Tenista("Agustin", 15000);
		tenistas[4] = new Tenista("Sebastian", 3500);
		
		
		
		Arrays.sort(tenistas);
		
		for (Tenista t : tenistas) {
			System.out.println(t);
		}
		

	}

}
