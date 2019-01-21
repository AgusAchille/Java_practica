package g_events_09_foco;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class Campo_texto extends JTextField{
	private static int sig_num=1;
	private int num;
	private String nombre;
	
	public Campo_texto() {
		num = sig_num;
		sig_num++;
		nombre = "Campo " + num;
		addFocusListener(new Foco());
	}
	
	
	
	
	class Foco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			System.out.println(nombre + " Ganó foco");
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			System.out.println(nombre + " Perdió foco");
			
		}
	}
}
