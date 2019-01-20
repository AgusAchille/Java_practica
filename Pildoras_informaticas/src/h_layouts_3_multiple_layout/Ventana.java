package h_layouts_3_multiple_layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Ventana extends JFrame {

	public Ventana() {
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Capa_1(), BorderLayout.NORTH);
		add(new Capa_2(), BorderLayout.SOUTH);
		
		setVisible(true);
	}
}

class Capa_1 extends JPanel {
	public Capa_1() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add ( new JButton("UNO"));
		add ( new JButton("DOS"));
		add ( new JButton("TRES"));
	}
}

class Capa_2 extends JPanel {
	public Capa_2() {
		
		setLayout(new BorderLayout());
		add ( new JButton("                         CUATRO                           "), BorderLayout.WEST);
		add ( new JButton("CINCO"), BorderLayout.CENTER);
		add ( new JButton("SEIS"), BorderLayout.EAST);
	}
}