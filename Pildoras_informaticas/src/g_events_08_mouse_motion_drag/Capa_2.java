package g_events_08_mouse_motion_drag;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Capa_2 extends JPanel{
	
	// HACE LO MISMO QUE LA CAPA 1, PERO CON ARRAYS
	
	public Capa_2() {
		setBackground(new Color(0));
		Mouse_movimiento moviendo = new Mouse_movimiento();
		addMouseMotionListener(moviendo);
		addMouseListener(moviendo);
	}
	
	class Mouse_movimiento extends MouseAdapter{
		// Estos valores no son los mismos para todos los eventos
		// pero para MouseDragged funcionan.
		private int[] botones = {1024, 4096, 5120};
		
		private int x_inicial=0;
		private int[] rgb = {0,0,0};
		private int[] rgb_inicial = {0,0,0};		
		private Color color = new Color(0, 0, 0);
		
		@Override
		public void mouseDragged(MouseEvent e) {
			
			for(int i=0; i<3; i++) {
				if(e.getModifiersEx() == botones[i]) {
					rgb[i] = (-x_inicial) + e.getX() + rgb_inicial[i];
									
					if (rgb[i] < 0)
						rgb[i] = 0;
					if(rgb[i] > 255)
						rgb[i] = 255;				
				}
			}
			
			setBackground(new Color(rgb[0], rgb[1], rgb[2]));
		}

		@Override
		public void mousePressed(MouseEvent e) {
			x_inicial = e.getX();
			
			rgb_inicial[0] = rgb[0];
			rgb_inicial[1] = rgb[1];
			rgb_inicial[2] = rgb[2];
		}
	}
}