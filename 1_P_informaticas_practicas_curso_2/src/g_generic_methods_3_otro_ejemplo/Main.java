package g_generic_methods_3_otro_ejemplo;

public class Main {
	
	public static void main(String[] args) {
		
		Student[] list_1 = {
				new Student("Agustin"),
				new Student("Nancy"),
				new Student("Nicolás"),
				new Student("Fabián"),
				new Student("Micaela"),
		};
		
		Tiger[] list_2 = {
				new Tiger("Tiny"),
				new Tiger("Tomi"),
				new Tiger("Rex"),
				new Tiger("Lufa"),
				new Tiger("Cacha"),
		};
		
		
		printNames(list_1);
		printNames(list_2);
		
			
	}
	
	
	static <T extends Name> void printNames(T[] array) {
		for(T element : array)
			System.out.println(element.getName());
	}
	

}


class Student implements Name{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class Tiger implements Name{
	private String name;
	
	public Tiger(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}