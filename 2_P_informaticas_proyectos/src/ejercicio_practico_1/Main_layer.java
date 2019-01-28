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
	private String[] strings_box_2 = {"Error", "Information", "Warning", "Question", "Nothing"};
	private String[] strings_box_3 = {"String", "Icon", "Component", "Others", "Object Array"};
	private String[] strings_box_4 = {"Default", "Yes, No", "Yes, No, Cancel", "Yes, Cancel"};
	private String[] strings_box_5 = {"String Array", "Icon Array", "Object Array"};
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
	

	//----------------------Events-------------------------
	
	private class Show_action extends AbstractAction{
		private Object[] array;
		private Object object;
		private int img_type;
		private int option_type;
		
		public Show_action() {
			putValue(NAME, "Show");
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			switch(box_2.get_selection()) {
				case "Error":
					img_type = 0;
					break;
					
				case "Information":
					img_type = 1;
					break;
					
				case "Warning":
					img_type = 2;
					break;
					
				case "Question":
					img_type = 3;
					break;
					
				case "Nothing":
					img_type = -1;
					break;
			}
			
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
					
				case "Object Array":
					object = new Object[] {message, icon, btn, time};
					break;
					
				case "Others":
					object = time;
					break;
			}
			
			switch(box_4.get_selection()) {
				case "Default":
					option_type = -1;
					break;
					
				case "Yes, No":
					option_type = 0;
					break;
					
				case "Yes, No, Cancel":
					option_type = 1;
					break;
					
				case "Yes, Cancel":
					option_type = 2;
				break;
			}
			
			switch(box_5.get_selection()) {
				case "String Array":
					array = new Object[]{"Red", "Green", "Blue"};
					break;
					
				case "Icon Array":
					array = new Object[]{new ImageIcon("assets/theme/red.png"), new ImageIcon("assets/theme/green.png"), new ImageIcon("assets/theme/blue.png")};
					break;
					
				case "Object Array":
					array = new Object[]{message, icon, btn, time};
					break;
			}
			
			switch(box_1.get_selection()) {
				case "Message":
					JOptionPane.showMessageDialog(null, object, "Message", img_type);
					break;
					
				case "Confirm":
					JOptionPane.showConfirmDialog(null, object, "Confirm", option_type, img_type);
					break;
					
				case "Option":
					JOptionPane.showOptionDialog(null, object, "Option", 1, img_type, null, array, null);
					break;
					
				case "Input":
					if(box_6.get_selection().equals("Combo"))
						JOptionPane.showInputDialog(null, object, "input", img_type, null, new String[]{"Red", "Green", "Blue"}, "Green");
					else
						JOptionPane.showInputDialog(null, object, "Input", img_type);
					break;
			}
		}
	}
}

