package j_advanced_layouts_4_null;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{

	private JButton btn_1 = new JButton("Btn 1");
	
	public Capa_principal() {
		setLayout(null);
		
		btn_1.setBounds(300,250,80,40);
		add(btn_1);
	}

}
