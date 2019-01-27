package f_graf_7_imagenes;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class Capa_1 extends JPanel{
	
	private Image imagen;
	
	@Override
	public void paintComponent(Graphics g) {
		
		File ruta1 = new File("imagenes/fondo2.jpg");
		
		try {
			imagen = ImageIO.read(ruta1);		
		} catch (IOException e) {
			System.out.println("No se encontró la imagen");
		}
		
		int img_w = imagen.getWidth(null);		
		int img_h = imagen.getHeight(null);
		
		int screen_width = (int)getSize().getWidth();
		int screen_height = (int)getSize().getHeight();
		
		
		for(int i=0; i<screen_width/img_w + 1; i++)
			for(int j=0; j<screen_height/img_h + 1; j++)
				g.drawImage(imagen, i*img_w, j*img_h, null);
		
		
		/*
		g.copyArea(0, 0, 150, 150, 150, 0);
		g.copyArea(0, 0, 150, 150, 300, 0);
		*/
	}
}