package i_componentes_swing_16_Barra_herramientas;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Ventana extends JFrame{
	private JPanel capa_principal = new JPanel();
	
	//Colores
	private Color red = new Color(237, 31, 36);
	private Color green = new Color(105, 189, 69);
	private Color blue = new Color(56, 83, 164);
	
	//Acciones
	private Change_color change_red = new Change_color("Red", new ImageIcon("imagenes/red.png"), red, "ctrl A");
	private Change_color change_green = new Change_color("Green", new ImageIcon("imagenes/green.png"), green, "ctrl S");
	private Change_color change_blue = new Change_color("Blue", new ImageIcon("imagenes/blue.png"), blue, "ctrl D");
	
	//Menus
	private JMenu menu = new JMenu("colores");	
	private JMenuBar bar_menu = new JMenuBar();
	private JToolBar tool_bar = new JToolBar();
	
	public Ventana() {
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(capa_principal);
		
		menu.add(change_red);
		menu.add(change_green);
		menu.add(change_blue);
		
		bar_menu.add(menu);
		setJMenuBar(bar_menu);

		tool_bar.add(change_red);
		tool_bar.add(change_green);
		tool_bar.add(change_blue);
		tool_bar.addSeparator();;
		tool_bar.add(new Close_window());
		
		add(tool_bar, BorderLayout.NORTH);

		//hacer visible
		setVisible(true);
	}
	
	//Methods
	public void Create_action_keyboard(String combinacion, Action accion) {
		KeyStroke teclas = KeyStroke.getKeyStroke(combinacion);
		InputMap mapa_entrada = capa_principal.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
			
		mapa_entrada.put(teclas, combinacion);
			
		ActionMap mapa_accion = capa_principal.getActionMap();
			
		mapa_accion.put(combinacion, accion);			
	}
	
	class Close_window extends AbstractAction{
		Close_window(){
			putValue(SHORT_DESCRIPTION, "Cerrar Ventana");
			putValue(SMALL_ICON, new ImageIcon("imagenes/cerrar.png"));
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
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
			capa_principal.setBackground((Color) getValue("color_de_fondo"));
		}	
	}
}
