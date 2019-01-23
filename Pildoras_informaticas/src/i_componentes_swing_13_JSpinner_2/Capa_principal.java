package i_componentes_swing_13_JSpinner_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel {
	JSpinner spinner;

	public Capa_principal() {
		
		spinner = new JSpinner(
						new SpinnerNumberModel() {
							@Override
							public Object getNextValue() {
								return super.getPreviousValue();
							}
							
							@Override
							public Object getPreviousValue() {
								return super.getNextValue();
							}	
						} //SpinnerNumberModel
		); //JSpinner
		
		spinner.setPreferredSize(new Dimension(200, 20));
		add(spinner);
		
	} //Capa_principal
	
	/*
	private class Spinner_reverse extends SpinnerNumberModel {	
		public Spinner_reverse(int x, int y, int w, int z) {
			super(x, y, w, z);
		}

		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
			
		}
	}
	*/
}
