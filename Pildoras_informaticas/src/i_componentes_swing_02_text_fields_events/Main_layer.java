package i_componentes_swing_02_text_fields_events;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class Main_layer extends JPanel{
	private JTextField campo_1 = new JTextField(20);
	
	public Main_layer() {
		
		Document document_1 = campo_1.getDocument();
		
		document_1.addDocumentListener(new Text_listener());
		
		add (campo_1);
	}
	
	
	
	class Text_listener implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			System.out.println("change");
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("insert");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("remove");
			
		}
		
	}
}
