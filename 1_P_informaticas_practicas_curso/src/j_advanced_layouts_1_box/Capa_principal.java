package j_advanced_layouts_1_box;

import java.awt.BorderLayout;

import javax.swing.*;

public class Capa_principal extends JPanel{
	
	JLabel label_name = new JLabel("Name:");
	JLabel label_password = new JLabel("Password:");
	
	JTextField text_field_name = new JTextField(20);
	JPasswordField text_field_password = new JPasswordField(20);
	
	Box v_box_1 = new Box(1);
	
	Box h_box_1 = new Box(0);// 0 = horizontal, 1 = vertical
	Box h_box_2 = new Box(0);
	Box h_box_3 = new Box(0);
	
	JButton btn_send = new JButton("Send");
	JButton btn_cancel = new JButton("Cancel");
	
	public Capa_principal() {				
		setLayout(new BorderLayout());
		
		
		text_field_name.setMaximumSize(text_field_name.getPreferredSize());
		text_field_password.setMaximumSize(text_field_password.getPreferredSize());

		add(v_box_1, BorderLayout.CENTER);
		
			v_box_1.add(h_box_1);
				h_box_1.add(label_name);
				h_box_1.add(Box.createHorizontalStrut(20));
				h_box_1.add(text_field_name);
				
			v_box_1.add(h_box_2);
				h_box_2.add(label_password);
				h_box_2.add(Box.createHorizontalStrut(20));
				h_box_2.add(text_field_password);
				
			v_box_1.add(h_box_3);
				h_box_3.add(btn_send);
				h_box_3.add(Box.createHorizontalGlue());
				h_box_3.add(btn_cancel);
			
	}
}
