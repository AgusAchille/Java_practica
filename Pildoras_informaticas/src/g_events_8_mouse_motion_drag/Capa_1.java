package g_events_8_mouse_motion_drag;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Capa_1 extends JPanel{
	
	public Capa_1() {
		setBackground(new Color(0));
		Mouse_movimiento moviendo = new Mouse_movimiento();
		addMouseMotionListener(moviendo);
		addMouseListener(moviendo);
	}
	
	class Mouse_movimiento implements MouseMotionListener, MouseListener{
		// Estos valores no son los mismos para todos los eventos
		// pero para MouseDragged funcionan.
		// Estos valores son los devueltos por getModifiersEx()
		final int boton_izq = 1024;
		final int boton_der = 4096;
		final int boton_ambos = 5120;
		
		int red=0, green=0, blue=0;
		Color color = new Color(red, green, blue);
		
		//Se va a guardar el valor inicial del color al momento de presionar el boton del mouse
		int red_inicial = 0, green_inicial=0, blue_inicial=0;
		
		private int x_inicial=0;// Guarda la posición del mouse al momento de presionar el botón
		
		@Override
		public void mouseDragged(MouseEvent e) {
			
			if(e.getModifiersEx() == boton_izq) {
				red = (-x_inicial) + e.getX() + red_inicial;
								
				if (red<0)
					red=0;
				if(red>255)
					red=255;				
			}
			
			if(e.getModifiersEx() == boton_der) {
				green = (-x_inicial) + e.getX() + green_inicial;

				if (green<0)
					green=0;
				if(green>255)
					green=255;				
			}
			
			if(e.getModifiersEx() == boton_ambos) {
				blue = (-x_inicial) + e.getX() + blue_inicial;
				
				if (blue<0)
					blue=0;
				if(blue>255)
					blue=255;				
			}
			
			setBackground(new Color(red, green, blue));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			x_inicial = e.getX();
			
			red_inicial = red;
			green_inicial = green;
			blue_inicial = blue;
		}
		
		public void mouseMoved(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}		
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
}
