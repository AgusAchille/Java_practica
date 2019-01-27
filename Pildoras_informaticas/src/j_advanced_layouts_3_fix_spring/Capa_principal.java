package j_advanced_layouts_3_fix_spring;

import javax.swing.*;

public class Capa_principal extends JPanel{
	private JButton btn_1 = new JButton("Btn 1");
	private JButton btn_2 = new JButton("Btn 2");
	private JButton btn_3 = new JButton("Btn 3");
	
	private Spring spring = Spring.constant(10,10,100);
	private Spring fix_spring = Spring.constant(15);
	
	public Capa_principal() {
		
		SpringLayout layout = new SpringLayout();
		setLayout(layout);
		
		add(btn_1);
		add(btn_2);
		add(btn_3);
		
		layout.putConstraint(SpringLayout.WEST, btn_1, spring, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, btn_2, fix_spring, SpringLayout.EAST, btn_1);
		layout.putConstraint(SpringLayout.WEST, btn_3, fix_spring, SpringLayout.EAST, btn_2);
		layout.putConstraint(SpringLayout.EAST, this, spring, SpringLayout.EAST, btn_3);
		
	}
}
