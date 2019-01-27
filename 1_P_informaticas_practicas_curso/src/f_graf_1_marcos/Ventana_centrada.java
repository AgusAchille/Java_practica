package f_graf_1_marcos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana_centrada extends JFrame {
	public Ventana_centrada() {
		
		//Almacenamos nuestro sistema nativo de ventanas
		Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
		
		//Objeto con ancho y alto
		Dimension tam_pantalla = mi_pantalla.getScreenSize();//metodo que devuelve el ancho y alto de la ventana padre
		
		int height_p = tam_pantalla.height;
		int width_p = tam_pantalla.width;
		
		int height_v = height_p/2;
		int width_v = width_p/2;
		
		setSize(width_v, height_v);
		setLocation(width_p/2-width_v/2, height_p/2-height_v/2);
		setTitle("ventana centrada");
		
		Image icono = mi_pantalla.getImage("imagenes/icon2.png");
		setIconImage(icono);
		
		/*
		class posicion implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println((int)getLocation().getX() + "x" + (int)getLocation().getY());
				
			}
			
		}
		
		new Timer(333, new posicion()).start();
		*/
	}
}
