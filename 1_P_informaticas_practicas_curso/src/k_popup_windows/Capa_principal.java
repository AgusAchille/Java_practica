package k_popup_windows;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel {
	private JButton btn_1 = new JButton("Message 1");
	private JButton btn_2 = new JButton("Message 2");
	private JButton btn_3 = new JButton("Input 1");
	private JButton btn_4 = new JButton("Input 2");
	

	public Capa_principal() {
		btn_1.addActionListener(new Accion_botones());
		btn_2.addActionListener(new Accion_botones());
		btn_3.addActionListener(new Accion_botones());
		btn_4.addActionListener(new Accion_botones());

		add(btn_1);
		add(btn_2);
		add(btn_3);
		add(btn_4);
	}

	private class Accion_botones implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn_1)
				JOptionPane.showMessageDialog(null, "Has pulsado el botón 1");

			else if (e.getSource() == btn_2)
				JOptionPane.showMessageDialog(null, "Has pulsado el botón 2", "¿Qué botón pulse?",3);

			else if (e.getSource() == btn_3)
				JOptionPane.showInputDialog("Has pulsado el botón 3");

			else
				JOptionPane.showInputDialog(null, "Has pulsado el botón 4", "Esto es un tíulo 2555", 0);
		}
	}
}