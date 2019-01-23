package i_componentes_swing_14_JMenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{
	JMenuBar menu_bar = new JMenuBar();
	
	public Capa_principal() {
		
		JMenu menu_archivo = new JMenu("Archivo");
			JMenuItem archivo_guardar = new JMenuItem("Guardar");
			JMenuItem archivo_guardar_como = new JMenuItem("Guardar como");
			menu_archivo.add(archivo_guardar);
			menu_archivo.add(archivo_guardar_como);
		
		JMenu menu_edicion = new JMenu("Edición");
			JMenuItem edicion_copiar = new JMenuItem("Copiar");
			JMenuItem edicion_pegar = new JMenuItem("Pegar");
			JMenu menu_edicion_opciones = new JMenu("Opciones");
				JMenuItem edicion_opciones_1 = new JMenuItem("Opción 1");
				JMenuItem edicion_opciones_2 = new JMenuItem("Opción 2");
				menu_edicion_opciones.add(edicion_opciones_1);
				menu_edicion_opciones.add(edicion_opciones_2);
			menu_edicion.add(edicion_copiar);
			menu_edicion.add(edicion_pegar);
			menu_edicion.add(menu_edicion_opciones);
		
		JMenu menu_herramientas = new JMenu("Herramientas");
			JMenuItem herramientas_generales = new JMenuItem("Generales");
			menu_herramientas.add(herramientas_generales);
			
		
		
		menu_bar.add(menu_archivo);
		menu_bar.add(menu_edicion);
		menu_bar.add(menu_herramientas);
		
		add(menu_bar);
		
		
	}

}
