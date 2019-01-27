package d_sort_object_array;

import java.util.Arrays;

public class Main_futbol {
	
	public static void main(String[] args) {
		Futbolista[] futbolistas = new Futbolista[5];
		
		futbolistas[0] = new Futbolista("Agustin", 90000);
		futbolistas[1] = new Futbolista("Patricio", 15000);
		futbolistas[2] = new Futbolista("Cristina", 7000);
		futbolistas[3] = new Futbolista("Pablo", 2000);
		futbolistas[4] = new Futbolista("Sebastian", 3500);
		
		
		
		Arrays.sort(futbolistas);
		
		for (Futbolista t : futbolistas) {
			System.out.println(t);
		}

	}

}
