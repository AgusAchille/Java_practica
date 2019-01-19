package g_events_8_mouse_motion_drag;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Capa_1 extends JPanel{

	
	public Capa_1() {
		Mouse_movimiento moviendo = new Mouse_movimiento();
		addMouseMotionListener(moviendo);
		addMouseListener(moviendo);
	}
	
	class Mouse_movimiento implements MouseMotionListener, MouseListener{
		private boolean boton_izq = false;
		private boolean boton_der = false;
		int red=0, green=0, blue=0;
		int red_inicial = 0, green_inicial=0, blue_inicial=0;
		
		Color color = new Color(red, green, blue);
		private int x_inicial=0;
		
		@Override
		public void mouseDragged(MouseEvent e) {
			//System.out.println("x:" + e.getX() + " y:" + e.getY());
			if(boton_izq && !boton_der) {
				red = (-x_inicial) + e.getX() + red_inicial;
				
				if (red<0)
					red=0;
				if(red>255)
					red=255;				
			}
			
			if(!boton_izq && boton_der) {
				green = (-x_inicial) + e.getX() + green_inicial;
				
				if (green<0)
					green=0;
				if(green>255)
					green=255;				
			}
			
			if(boton_izq && boton_der) {
				blue = (-x_inicial) + e.getX() + blue_inicial;
				
				if (blue<0)
					blue=0;
				if(blue>255)
					blue=255;				
			}
			
			setBackground(new Color(red, green, blue));
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			x_inicial = e.getX();
			red_inicial = red;
			green_inicial = green;
			blue_inicial = blue;
			
			switch(e.getButton()) {
				case 1:
					boton_izq = true;
					break;
				case 3:
					boton_der = true;
					break;
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			switch(e.getButton()) {
			case 1:
				boton_izq = false;
				break;
			case 3:
				boton_der = false;
				break;
			}
		}
		
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
}
