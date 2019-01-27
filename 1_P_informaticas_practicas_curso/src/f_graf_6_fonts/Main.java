package f_graf_6_fonts;

import java.awt.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		new Ventana();
		
		//Obetener fuentes instaladas
		
		
		String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String fuente_buscar = "Montserrat";
		boolean encontrada = false;
		
		for (String fuente : fuentes) {
			if(fuente.equals(fuente_buscar))
				encontrada = true;
		}
		
		/*
		if (encontrada)
			System.out.println("Está la fuente");
		*/
		
		
	}
	
}