package h_layouts_2_border_layout;

import java.awt.*;

import javax.swing.*;

public class Capa_1 extends JPanel {

	public Capa_1() {

		setLayout(new BorderLayout(10,10));

		add(new JButton("Red"), BorderLayout.NORTH);
		add(new JButton("Green"), BorderLayout.EAST);
		add(new JButton("Blue"), BorderLayout.WEST);
		add(new JButton("Yellow"), BorderLayout.SOUTH);
		add(new JButton("White"), BorderLayout.CENTER);
	}
}
