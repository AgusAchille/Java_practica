package ejercicio_practico_1;

import javax.swing.*;

public class Button_layer extends JPanel{
	ButtonGroup group = new ButtonGroup();
	
	public Button_layer(String title, String[] buttons) {
		//Layout Box donde los elementos se colocan verticalmente
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//Agregamos un borde con un título
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
		
		for (int i =0; i<buttons.length;i++) {
			JRadioButton button = new JRadioButton(buttons[i]);
			group.add(button);
			add(button);
			
			//Le asignamos al ActionCommand  de cada boton el mismo String que el nombre
			// para que el método_selection pueda retornarlo
			button.setActionCommand(buttons[i]);
			
			//Marcamos al primer radiobutton como seleccionado
			if(i==0) button.setSelected(true);
		}
		
	}
	
	public String get_selection() {
		return group.getSelection().getActionCommand();
	}
	
}
