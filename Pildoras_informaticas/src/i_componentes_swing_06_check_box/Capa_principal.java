package i_componentes_swing_06_check_box;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Capa_principal extends JPanel{
	
	private JLabel texto;
	private JCheckBox check_bold, check_italic;
	private Font font = new Font("Arial", Font.PLAIN, 24);
	
	JPanel capa_1 = new JPanel();
	JPanel capa_2 = new JPanel();
	
	public Capa_principal() {
		setLayout(new BorderLayout());
		
		texto = new JLabel("Esto es un texto de prueba");
		texto.setFont(font);
		
		capa_1.add(texto);
		add(capa_1,BorderLayout.CENTER);
		
		check_bold = new JCheckBox("Negrita");
		check_italic = new JCheckBox("Itálica");
		
		check_bold.addActionListener(new Maneja_check());
		check_italic.addActionListener(new Maneja_check());
		
		capa_2.add(check_bold);
		capa_2.add(check_italic);
		
		add(capa_2, BorderLayout.SOUTH);
		
	}
	
	class Maneja_check implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int style = 0;
			
			if (check_bold.isSelected())
				style += Font.BOLD;
			
			if (check_italic.isSelected())
				style += Font.ITALIC;
			
			texto.setFont(new Font ("Arial", style, 24 ));
			
			
		}
		
		
	}

}
