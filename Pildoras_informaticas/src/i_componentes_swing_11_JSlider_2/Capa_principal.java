package i_componentes_swing_11_JSlider_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel {
	JSlider slider = new JSlider(8, 50, 10);
	JLabel rotulo = new JLabel("No me gusta esperar, pero igual te espero");
	JPanel capa_1 = new JPanel();

	public Capa_principal() {
		setLayout(new BorderLayout());

		add(capa_1, BorderLayout.NORTH);
		add(rotulo, BorderLayout.CENTER);
		
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		slider.setFont(new Font("Arial", Font.PLAIN, 10));
		
		capa_1.add(slider);
		
		slider.addChangeListener(new Slider_listener());
	}

	class Slider_listener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			JSlider slider_2 = (JSlider) e.getSource(); 
			rotulo.setFont(new Font("Ariel", Font.PLAIN, slider_2.getValue()));						

		}
	}
}
