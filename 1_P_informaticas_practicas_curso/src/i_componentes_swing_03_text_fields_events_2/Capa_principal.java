package i_componentes_swing_03_text_fields_events_2;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

public class Capa_principal extends JPanel {
	JPanel capa_1 = new JPanel();
	JPanel capa_2 = new JPanel();

	JLabel label_usuario = new JLabel("Usuario:");
	JLabel label_password = new JLabel("Password:");

	JTextField campo_usuario = new JTextField();
	
	JPasswordField campo_password = new JPasswordField();

	JButton btn_enviar = new JButton("Enviar");

	public Capa_principal() {
		Document document_password = campo_password.getDocument();
		document_password.addDocumentListener(new Password_listener());
		
		setLayout(new BorderLayout());
		
		capa_1.add(label_usuario);
		capa_1.add(campo_usuario);
		capa_1.add(label_password);
		capa_1.add(campo_password);
		
		capa_1.setLayout(new GridLayout(2, 2));
		
		add(capa_1, BorderLayout.NORTH);

		add(capa_2, BorderLayout.SOUTH);
		capa_2.add(btn_enviar);
	}
	
	
	
	class Password_listener implements DocumentListener{
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			
			int largo = e.getDocument().getLength(); 
			if (largo >= 8) {
				if (largo>12)
					campo_password.setBackground(new Color(200, 90, 96));
				else
					campo_password.setBackground(new Color(90, 200, 96));
			}				
			else 
				campo_password.setBackground(Color.WHITE);
		}
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			int largo = e.getDocument().getLength(); 
			if (largo >= 8) {
				if (largo>12)
					campo_password.setBackground(new Color(200, 90, 96));
				else
					campo_password.setBackground(new Color(90, 200, 96));
			}				
			else 
				campo_password.setBackground(Color.WHITE);
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
	}
}
