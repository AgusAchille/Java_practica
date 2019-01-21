package g_events_09_foco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa_1 extends JPanel{
	
	Campo_texto campo1;
	Campo_texto campo2;
	
	public Capa_1() {
	}
	
	
	@Override
	public void paintComponent(Graphics g) {		
		super.paintComponent(g);
		
		setLayout(null);		
		campo1 = new Campo_texto();
		campo2 = new Campo_texto();
		campo1.setBounds(10,10,100,20);
		campo2.setBounds(10,40,100,20);
		
		add(campo1);
		add(campo2);
	}	
}

