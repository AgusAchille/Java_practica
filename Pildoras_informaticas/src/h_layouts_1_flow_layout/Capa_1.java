package h_layouts_1_flow_layout;

import java.awt.FlowLayout;

import javax.swing.*;

public class Capa_1 extends JPanel{
		
	public Capa_1() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 20));
		
		
		add(new JButton("Red"));
		add(new JButton("Green"));
		add(new JButton("Blue"));
	}
}
