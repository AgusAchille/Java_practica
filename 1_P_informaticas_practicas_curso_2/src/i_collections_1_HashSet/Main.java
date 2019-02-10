package i_collections_1_HashSet;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		HashSet<String> my_set = new HashSet<String>();
		
		my_set.add("Agus");
		my_set.add("Nan");
		my_set.add("Estudiantes");
		my_set.add("Nan");
		
		for (String num : my_set)
			System.out.println(num);
		
		
		
	}
}

