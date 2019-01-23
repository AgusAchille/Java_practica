package i_componentes_swing_12_JSpinner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{
	JSpinner spinner = new JSpinner();
	
	public Capa_principal() {
		
		//spinner = new JSpinner(new SpinnerDateModel());
		
		//String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves"};
		
		//String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//spinner = new JSpinner(new SpinnerListModel(fuentes));
		
		spinner = new JSpinner ( new SpinnerNumberModel(5,0,10,1));
		
		spinner.setPreferredSize(new Dimension(200,20));
		
		add(spinner);
		
		
		
	}

}
