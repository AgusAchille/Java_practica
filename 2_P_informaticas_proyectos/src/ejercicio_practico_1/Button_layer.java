package ejercicio_practico_1;

import javax.swing.*;

public class Button_layer extends JPanel{
	ButtonGroup group = new ButtonGroup();
	
	public Button_layer(String title, String[] buttons) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
		
		
		for (int i =0; i<buttons.length;i++) {
			JRadioButton button = new JRadioButton(buttons[i]);
			group.add(button);
			add(button);
			
			button.setActionCommand(buttons[i]);
			
			if(i==0) button.setSelected(true);
		}
		
	}
	
	public String get_selection() {
		return group.getSelection().getActionCommand();
	}
	
}
