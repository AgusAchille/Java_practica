
public class Random_int {

	public static void main(String[] args) {
		int cero = 0, uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;

		for (int i = 0; i < 10000000; i++) {
			int num = (int) (Math.random()*5+1); 
			
			switch (num) {
			case 0:
				cero++;
				break;
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				cuatro++;
				break;
			case 5:
				cinco++;
				break;
			}
		}

		System.out.println("0: " + cero);
		System.out.println("1: " + uno);
		System.out.println("2: " + dos);
		System.out.println("3: " + tres);
		System.out.println("4: " + cuatro);
		System.out.println("5: " + cinco);

	}
}
