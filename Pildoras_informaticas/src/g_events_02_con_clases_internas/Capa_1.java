package g_events_02_con_clases_internas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa_1 extends JPanel{
	
	JButton boton_azul = new JButton("Azul");
	JButton boton_verde = new JButton("Verde");
	public JButton boton_rojo = new JButton("Rojo");
	
	public Capa_1() {
		add(boton_azul);
		add(boton_verde);
		add(boton_rojo);
		
		Color azul = new Color(28, 51, 65);
		Color verde = new Color(107, 185, 131);
		Color rojo = new Color(237, 99, 83);
		
		boton_azul.addActionListener( new Fondo(azul) );
		boton_verde.addActionListener( new Fondo(verde) );
		boton_rojo.addActionListener( new Fondo(rojo) );
	}
	
	class Fondo implements ActionListener{
		private Color color;

		public Fondo(Color color) {
			this.color = color;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground(color);
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}	
}