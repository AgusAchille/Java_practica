package g_events_07_mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Capa_1 extends JPanel{
	Color color_principal = new Color(16, 167, 15);
	Random ran = new Random();
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	
	public Capa_1() {
		addMouseListener(new Mouse_listener());
		setBackground(color_principal);
	}
	
	//La clase adaptadora es MouseAdapter
	class Mouse_listener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			setBackground(color_principal);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
//			System.out.println("Afuera");
			setBackground(color_principal.darker());
		}

		@Override
		public void mousePressed(MouseEvent e) {
			//System.out.println("Botón izquierdo presionado");
			
			//Solo si es el click izquierdo
			if(e.getButton()==1)
				setBackground(color_principal.brighter());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("x:"+e.getX() + " y:" + e.getY());
			switch(e.getButton()) {
				case 1:
					setBackground(color_principal);
					break;
				case 3:
					color_principal = new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
					setBackground(color_principal);
			}
//			System.out.println("Botón izquierdo soltado");			
		}
	}
}
