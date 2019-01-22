package i_componentes_swing_10_JSlider;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Capa_principal extends JPanel{
	
	JSlider slider = new JSlider(0,100,25);
	
	public Capa_principal() {
		//setLayout( new BorderLayout());
		//slider.setOrientation(SwingConstants.VERTICAL);
		
		slider.setMajorTickSpacing(25);//marcas mayores
		slider.setMinorTickSpacing(5);//marcas menores
		
		slider.setPaintTicks(true);//Pintar las marcas
		
		slider.setFont(new Font("Arial", Font.PLAIN,10));
		
		slider.setPaintLabels(true);//Pintar los números
		
		slider.setSnapToTicks(true);//Se pega a las marcas menores
		
		add(slider);
	}
}
