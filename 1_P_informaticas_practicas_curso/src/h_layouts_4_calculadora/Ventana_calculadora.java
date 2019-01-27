package h_layouts_4_calculadora;

import java.awt.*;
import java.awt.event.*;

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
	
	//Capa que contiene los BOTONES ///////////////////////////
	class Capa_botones extends JPanel{
		
		//Si esta variable es true cuando se ingrese un número se borra el display
		private boolean principio = true;
		private double resultado = 0;
		private String ultima_operacion="+"; // empieza en más para que el primer número ingresadolo sume al 0
		
		public Capa_botones( ){
			
			setLayout(new GridLayout(4,4));
			
			Apretar_numero apretar_numero = new Apretar_numero();
			Operacion apretar_operacion = new Operacion();
			
			agregar_boton("7", apretar_numero);
			agregar_boton("8", apretar_numero);
			agregar_boton("9", apretar_numero);
			agregar_boton("/", apretar_operacion);
			agregar_boton("4", apretar_numero);
			agregar_boton("5", apretar_numero);
			agregar_boton("6", apretar_numero);
			agregar_boton("*", apretar_operacion);
			agregar_boton("1", apretar_numero);
			agregar_boton("2", apretar_numero);
			agregar_boton("3", apretar_numero); 
			agregar_boton("-", apretar_operacion);
			agregar_boton("0", apretar_numero);
			agregar_boton(".", apretar_numero);
			agregar_boton("=", apretar_operacion);
			agregar_boton("+", apretar_operacion);		
		}
		
		//Método para agregar los botones a la capa, asignandoles una acción
		private void agregar_boton(String nombre, ActionListener listener) {
			JButton boton = new JButton(nombre);
			boton.addActionListener(listener);
			add (boton);
		}
		
				
		//Acción al apretar una operación
		class Operacion implements ActionListener{
			
			@Override
			public void actionPerformed (ActionEvent e) {
				principio = true;
				
				//Se le asigna al resultado el resultado de la última operación, por default la primera es una suma
				calcular(Double.parseDouble(display.getText()));
				
				//Se recuerda el botón apretado para realizar la operación cuando se preciona la siguiente operación
				ultima_operacion = e.getActionCommand();
			}
			
			void calcular(double valor_en_display) {
				switch(ultima_operacion) {
					case "+":
						resultado += valor_en_display;
						break;
					case "-":
						resultado -= valor_en_display;
						break;
					case "/":
						resultado /= valor_en_display;
						break;
					case "*":
						resultado *= valor_en_display;
						break;
					case "=":
						resultado = valor_en_display;
						break;
				}
				
				display.setText(" "+ resultado);	
			}
		}
		
		
		//Acción al apretar un número al acapa 
		class Apretar_numero implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if (principio==true) {
					display.setText("");
					principio = false;
				}
				
				String entrada = e.getActionCommand();
				
				display.setText(display.getText() + entrada);
			}
		}
	}
}
