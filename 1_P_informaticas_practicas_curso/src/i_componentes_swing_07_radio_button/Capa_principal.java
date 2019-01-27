package i_componentes_swing_07_radio_button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Capa_principal extends JPanel{
	ButtonGroup grupo_1 = new ButtonGroup();
	JRadioButton radio_red = new JRadioButton("Red", true);
	JRadioButton radio_green = new JRadioButton("Green", false);
	JRadioButton radio_blue = new JRadioButton("Blue", false);
	
	
	public Capa_principal() {
		grupo_1.add(radio_red);
		grupo_1.add(radio_green);
		grupo_1.add(radio_blue);
		
		add(radio_red);
		add(radio_green);
		add(radio_blue);
	}

}
