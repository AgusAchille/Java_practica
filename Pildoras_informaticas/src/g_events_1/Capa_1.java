package g_events_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa_1 extends JPanel implements ActionListener{
	
	JButton boton_azul = new JButton("Azul");
	JButton boton_verde = new JButton("Verde");
	public JButton boton_rojo = new JButton("Rojo");
	
	
	public Capa_1() {
		add(boton_azul);
		add(boton_verde);
		add(boton_rojo);
		
		
		boton_azul.addActionListener(this);
		boton_verde.addActionListener(this);
		boton_rojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boton_azul)
			setBackground(new Color(28, 51, 65));
		
		if (e.getSource() == boton_verde)
			setBackground(new Color(107, 185, 131));
		
		if (e.getSource() == boton_rojo)
			setBackground(new Color(237, 99, 83));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	
}