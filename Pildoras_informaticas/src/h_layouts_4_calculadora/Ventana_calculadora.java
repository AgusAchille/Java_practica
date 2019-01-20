package h_layouts_4_calculadora;

import java.awt.*;

import javax.swing.*;

public class Ventana_calculadora extends JFrame {
	public Ventana_calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setBounds(200, 200, 450, 300);
		
		Capa_container container = new Capa_container();
		add (container);
		
		
		
		
		
		
		setVisible(true);
	}
}

class Capa_container extends JPanel{
	JButton display = new JButton("0");
	Capa_botones capa_botones = new Capa_botones();
	
	public Capa_container() {
		setLayout(new BorderLayout());
		
		display.setEnabled(false);
		
		add(display, BorderLayout.NORTH);	
		add(capa_botones, BorderLayout.CENTER);
	}
}

class Capa_botones extends JPanel{
	public Capa_botones(){
		setLayout(new GridLayout(4,4));
		
		agregar_boton("7");
		agregar_boton("8");
		agregar_boton("9");
		agregar_boton("/");
		agregar_boton("4");
		agregar_boton("5");
		agregar_boton("6");
		agregar_boton("*");
		agregar_boton("1");
		agregar_boton("2");
		agregar_boton("3");
		agregar_boton("-");
		agregar_boton("0");
		agregar_boton(".");
		agregar_boton("=");
		agregar_boton("+");
		
		
		
		
	}
	
	private void agregar_boton(String nombre) {
		JButton boton = new JButton(nombre);
		add (boton);
	}
}