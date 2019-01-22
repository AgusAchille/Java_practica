package i_componentes_swing_09_combo_box;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Capa_principal extends JPanel{
	private JLabel texto = new JLabel("I am free to be whatever I, whatever I choose");
	private JComboBox combo = new JComboBox();
	private JPanel capa_1 = new JPanel();
	
	public Capa_principal() {
		setLayout( new BorderLayout());
		texto.setFont( new Font("Montserrat", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		//combo.setEditable(true);
		
		combo.addItem("Serif");
		combo.addItem("Arial");
		combo.addItem("Monospaced");
		combo.addItem("Dialog");
		combo.addItem("Montserrat");
		
		combo.addActionListener(new Evento_combo());
		
		capa_1.add(combo);
		
		add(capa_1, BorderLayout.NORTH);
		
	}
	
	private class Evento_combo implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			texto.setFont(new Font (combo.getSelectedItem().toString(), Font.PLAIN, 18));
		}
		
	}
	
}
