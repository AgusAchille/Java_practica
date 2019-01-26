package g_events_11_multiple_sources_mejorado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Capa_1 extends JPanel{
	private Color red = new Color(237, 31, 36);
	private Color green = new Color(105, 189, 69);
	private Color blue = new Color(56, 83, 164);
	
	private Change_color change_red = new Change_color("Red", new ImageIcon("imagenes/red.png"), red, "ctrl A");
	private Change_color change_green = new Change_color("Green", new ImageIcon("imagenes/green.png"), green, "ctrl S");
	private Change_color change_blue = new Change_color("Blue", new ImageIcon("imagenes/blue.png"), blue, "ctrl D");
	
	public Capa_1() {
		add(new JButton(change_red));
		add(new JButton(change_green));
		add(new JButton(change_blue));
			
		/*
		Create_action_keyboard("ctrl A", change_red);
		Create_action_keyboard("ctrl S", change_green);
		Create_action_keyboard("ctrl D", change_blue);
		*/
	}
	
	//Methods
	public void Create_action_keyboard(String combinacion, Action accion) {
		KeyStroke teclas = KeyStroke.getKeyStroke(combinacion);
		InputMap mapa_entrada = getInputMap(WHEN_IN_FOCUSED_WINDOW);
			
		mapa_entrada.put(teclas, combinacion);
			
		ActionMap mapa_accion = getActionMap();
			
		mapa_accion.put(combinacion, accion);			
	}
	
	class Change_color extends AbstractAction{
		public Change_color(String nombre, Icon icono, Color color) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Cambiar el fondo al color " + nombre.toLowerCase());
			putValue("color_de_fondo", color);
		}
		
		//sobrecarga que admite una combinacion de teclas para activar la accion
		public Change_color(String nombre, Icon icono, Color color, String combinacion_teclas) {
			putValue(NAME, nombre);
			putValue(SMALL_ICON, icono);
			putValue(SHORT_DESCRIPTION, "Cambiar el fondo al color " + nombre.toLowerCase());
			putValue("color_de_fondo", color);
			Create_action_keyboard(combinacion_teclas, this);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			setBackground((Color) getValue("color_de_fondo"));
		}	
	}
}
