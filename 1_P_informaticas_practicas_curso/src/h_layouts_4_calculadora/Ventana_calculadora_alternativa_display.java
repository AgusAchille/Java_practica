package h_layouts_4_calculadora;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ventana_calculadora_alternativa_display extends JFrame {
	public Ventana_calculadora_alternativa_display() {
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setBounds(200, 200, 450, 300);
		
		Capa_container container = new Capa_container();
		add (container);
		
		setVisible(true);
	}
}

class Capa_container2 extends JPanel{
	JButton display = new JButton("0");
	Capa_botones2 capa_botones2 = new Capa_botones2(display);
	
	public Capa_container2() {
		setLayout(new BorderLayout());
		
		display.setEnabled(false);
		
		add(display, BorderLayout.NORTH);	
		add(capa_botones2, BorderLayout.CENTER);
	}
}

class Capa_botones2 extends JPanel{
	JButton display; //display que va a ser solicitado por el constructor
	
	public Capa_botones2(JButton display){
		this.display=display;
		
		setLayout(new GridLayout(4,4));
		
		agregar_boton("7", new Apretar_numero());
		agregar_boton("8", new Apretar_numero());
		agregar_boton("9", new Apretar_numero());
		agregar_boton("/", new Apretar_numero());
		agregar_boton("4", new Apretar_numero());
		agregar_boton("5", new Apretar_numero());
		agregar_boton("6", new Apretar_numero());
		agregar_boton("*", new Apretar_numero());
		agregar_boton("1", new Apretar_numero());
		agregar_boton("2", new Apretar_numero());
		agregar_boton("3", new Apretar_numero());
		agregar_boton("-", new Apretar_numero());
		agregar_boton("0", new Apretar_numero());
		agregar_boton(".", new Apretar_numero());
		agregar_boton("=", new Apretar_numero());
		agregar_boton("+", new Apretar_numero());
		
	}
	
	private void agregar_boton(String nombre, ActionListener listener) {
		JButton boton = new JButton(nombre);
		boton.addActionListener(listener);
		add (boton);
	}
	
	class Apretar_numero implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			display.setText(e.getActionCommand());
		}
	}
}