package g_events_a3_multiple_listener;

import javax.swing.*;
import java.awt.event.*;

public class Mini_ventana extends JFrame {
	private static int sig_num = 1;
	private int num;

	public Mini_ventana(JButton btn) {
		num = sig_num;
		sig_num++;

		setTitle("Ventana " + num);

		btn.addActionListener(new Cerrar_ventana());

		setBounds(50 + 15 * (num - 1), 50 + 15 * (num - 1), 350, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setVisible(true);
	}

	class Cerrar_ventana implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			sig_num = 1;
		}
	}
}
