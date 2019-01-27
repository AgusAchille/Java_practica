package g_events_11_multiple_sources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa_1 extends JPanel{
	Color red = new Color(237, 31, 36);
	Color green = new Color(105, 189, 69);
	Color blue = new Color(56, 83, 164);
	
	Change_color change_red = new Change_color("Red", new ImageIcon("imagenes/red.png"), red);
	Change_color change_green = new Change_color("Green", new ImageIcon("imagenes/green.png"), green);
	Change_color change_blue = new Change_color("Blue", new ImageIcon("imagenes/blue.png"), blue);
	
	public Capa_1() {
		add(new JButton(change_red));
		add(new JButton(change_green));
		add(new JButton(change_blue));
		
		//Determinar la combinación de teclas
		KeyStroke red_key = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke green_key = KeyStroke.getKeyStroke("ctrl S");
		KeyStroke blue_key = KeyStroke.getKeyStroke("ctrl D");		
		
		InputMap mapa_entrada = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		
		//Vinculo la combinación de teclas a un objeto String a elección
		mapa_entrada.put(red_key, "fondo_red");
		mapa_entrada.put(green_key, "fondo_green");
		mapa_entrada.put(blue_key, "fondo_blue");
		
		ActionMap mapa_accion = getActionMap();
		
		//Vinculo el objeto String a una acción. La concha de la lora.
		mapa_accion.put("fondo_red", change_red);
		mapa_accion.put("fondo_green", change_green);
		mapa_accion.put("fondo_blue", change_blue);
	}
	
	class Change_color extends AbstractAction{
		public Change_color(String nombre, Icon icono, Color color) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Cambiar el fondo al color " + nombre.toLowerCase());
			putValue("color_de_fondo", color);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground((Color) getValue("color_de_fondo"));
		}	
	}
}
