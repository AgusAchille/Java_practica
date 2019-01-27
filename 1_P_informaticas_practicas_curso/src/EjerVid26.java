public class EjerVid26 {

	public static void main(String[] args) {

		double[][] guita = new double[6][6];

		for (int j = 0; j < guita[0].length; j++) {
			guita[0][j] = j + 10;
			guita[1][j] = 10000;
		}

		for (int i = 2; i < guita.length; i++) {
			for (int j = 0; j < guita[0].length; j++) {
				guita[i][j] = guita[i - 1][j] * (guita[0][j] / 100 + 1);
			}
		}

		for (double[] fila : guita) {
			for (double elem : fila) {
				System.out.printf("[%8.2f] ", elem);
			}
			System.out.println("");
		}

	}
}