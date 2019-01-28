package ejercicio_practico_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.*;

public class Main_layer extends JPanel{
	private JPanel layer_1 = new JPanel();
	private JPanel layer_2 = new JPanel();
	
	private JButton show_btn = new JButton(new Show_action());
	
	private String[] strings_box_1 = {"Message", "Confirm", "Option", "Input"};
	private String[] strings_box_2 = {"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
	private String[] strings_box_3 = {"String", "Icon", "Component", "Others", "Object[]"};
	private String[] strings_box_4 = {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"};
	private String[] strings_box_5 = {"String[]", "Icon[]", "Object[]"};
	private String[] strings_box_6 = {"Text Field", "Combo"};
	
	private Button_layer box_1 = new Button_layer("Type",  strings_box_1);
	private Button_layer box_2 = new Button_layer("Message type",  strings_box_2);
	private Button_layer box_3 = new Button_layer("Message",  strings_box_3);
	private Button_layer box_4 = new Button_layer("Confirm",  strings_box_4);
	private Button_layer box_5 = new Button_layer("Option",  strings_box_5);
	private Button_layer box_6 = new Button_layer("Input",  strings_box_6);
	
	private String message = "Holaaaaaa!";
	private Icon icon = new ImageIcon("assets/play.png");
	private Object time = new Date();
	private Component btn = new JButton("Hellooooo!");
	
	public Main_layer() {
		setLayout(new BorderLayout());
		
		layer_1.setLayout(new GridLayout(2,3));
		layer_2.add(show_btn);

		add(layer_1, BorderLayout.CENTER);
		add(layer_2, BorderLayout.SOUTH);
		
		layer_1.add(box_1);
		layer_1.add(box_2);
		layer_1.add(box_3);
		layer_1.add(box_4);
		layer_1.add(box_5);
		layer_1.add(box_6);
	}
	
	
	private class Show_action extends AbstractAction{
		private Object object;
		
		public Show_action() {
			putValue(NAME, "Show");
		}
		
				
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(box_3.get_selection()) {
				case "String":
					object = message;
					break;
					
				case "Icon":
					object = icon;
					break;
					
				case "Component":
					object = btn;
					break;
					
				case "Object[]":
					object = new Object[] {message, icon, btn, time};
					break;
					
				case "Others":
					object = time;
					break;
			}
			
			
			
			
			
			
			
			
			
			switch(box_1.get_selection()) {
				case "Message":
					JOptionPane.showMessageDialog(null, object, "titulo", 0);
					break;
					
				case "Confirm":
					JOptionPane.showConfirmDialog(null, object, "titulo", 0, 0);
					break;
					
				case "Option":
					JOptionPane.showOptionDialog(null, object, "titulo", 0, 0, null, null, null);
					break;
					
				case "Input":
					JOptionPane.showInputDialog(null, object, "titulo", 0);
					break;
			}
		}
	
	}
}

