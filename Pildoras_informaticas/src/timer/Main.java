package timer;

import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		Obtener_hora listener = new Obtener_hora();
		
		Timer temporizador = new Timer(1000, listener);
		
		temporizador.start();
		
		//JOptionPane.showMessageDialog(null,"hola");
		
		new Scanner(System.in).nextLine();
		temporizador.stop();

	}
}
