package g_events_6_teclado_keyListener;

import javax.swing.*;
import java.awt.event.*;

public class Ventana extends JFrame{
	public Ventana() {
		setVisible(true);
		setBounds(100, 100, 200, 200);
		
		addKeyListener(new teclado_listener());
	}
	
	class teclado_listener implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(
					"Cod: " + e.getKeyCode() + "\nChar: " + e.getKeyChar()
					);			
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}
}
