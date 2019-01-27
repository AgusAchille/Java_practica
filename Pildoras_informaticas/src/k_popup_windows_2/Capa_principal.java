package k_popup_windows_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel {
	private JButton btn_1 = new JButton("Confirm 1");
	private JButton btn_2 = new JButton("Confirm 2");
	private JButton btn_3 = new JButton("Option 1");
	private JButton btn_4 = new JButton("Option 2");
	

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
				JOptionPane.showConfirmDialog(null, "Confirmame", "Capooo", 0);

			else if (e.getSource() == btn_2)
				JOptionPane.showConfirmDialog(null, "Confirmame 2", "Capooo 2", 1);

			else if (e.getSource() == btn_3)
				JOptionPane.showOptionDialog(null, "Estas son las opciones", "Más opciones", 1, 1, null, null, null);

			else
				JOptionPane.showOptionDialog(null, "Estas son las opciones", "Más opciones", 1, 1, null, null, null);
		}
	}
}