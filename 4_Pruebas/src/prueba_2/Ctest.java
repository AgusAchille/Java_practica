package prueba_2;

public class Ctest {
	public static void main(String[] a) {
		
		
		
	System.out.println(year(2000));
		
	}
	
	
	static String year(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0)
					return "Yes";
			}
			else
				return "Yes";			
		}
			
		return "No";
	}
	
}