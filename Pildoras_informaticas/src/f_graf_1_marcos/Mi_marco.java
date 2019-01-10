package f_graf_1_marcos;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Mi_marco extends JFrame{
	public Mi_marco(){
		/*
		setSize(500,300);
		setLocation(100,200);
		*/
		
		setBounds(100,200,500,300);
		
		//determinar si se puede cambiar tamaño
		//setResizable(false);

		//Ventana maximizada
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Primeras ventanas");
		
		//Almacenamos nuestro sistema nativo de ventanas
		Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
		
		Image icono = mi_pantalla.getImage("imagenes/icon2.png");
		setIconImage(icono);
		
		
	}
}
