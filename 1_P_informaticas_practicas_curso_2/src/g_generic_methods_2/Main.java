package g_generic_methods_2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Double[] array = {65.,22.0,49.,59.,4.,15.,55.,64.,44.};
		
		
		double num  = array[0] + getMenor2(array);
		
		System.out.println(num);

	}
	
	
	static <T extends Comparable> T getMenor2(T[] other) {
		T menor = other[0];
		
		for(int i=1; i<other.length; i++) {
			
			if(menor.compareTo(other[i]) > 0)
				menor = other[i];
		}
		
		return menor;
	}	
}