package i_componentes_swing_01_text_fields;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class Capa_1 extends JPanel{
	JTextField campo_1 = new JTextField("Agregar Email", 20);
	JButton boton_1 = new JButton("Comprobar");
	JLabel check = new JLabel("");
	
	JPanel capa_2 = new JPanel();
	JPanel capa_3 = new JPanel();
	
	public Capa_1() {
		setLayout(new BorderLayout());
		
		capa_2.add(new JLabel("Email:"));
		capa_2.add(campo_1);
		capa_2.add(boton_1);
		add(capa_2, BorderLayout.NORTH);
		
		capa_3.add(check);
		add(capa_3, BorderLayout.CENTER);
		
		check.setVisible(false);
		boton_1.addActionListener(new Obtener_texto());
		//trim quita los espacios adicionales al final y al principio
		System.out.println(campo_1.getText().trim());	
	}
	
	class Obtener_texto implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			check.setVisible(true);
			String email = campo_1.getText().trim();
			int ok = 0;
			for(int i=0; i<email.length();i++) {
				if(email.charAt(i)=='@')
					ok++;
			}
			
			if (ok==1)
				check.setText("Email válido");
			else
				check.setText("Email no válido");
		}
		
	}
	
}
