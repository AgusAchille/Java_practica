package j_advanced_layouts_5_Layout_propio;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{
	
	JLabel label_name = new JLabel("Name:");
	JTextField text_field_name = new JTextField();
	
	JLabel label_lastname = new JLabel("Lastname:");
	JTextField text_field_lastname = new JTextField();
	
	JLabel label_address = new JLabel("Address:");
	JTextField text_field_address = new JTextField();
	
	public Capa_principal() {
		setLayout(new In_columns());
		
		add(label_name);
		add(text_field_name);
		
		add(label_address);
		add(text_field_address);
		
		add(label_lastname);
		add(text_field_lastname);
		
	}

}
