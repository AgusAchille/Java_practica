package procesador_de_texto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{

	//Variables
	private JPanel capa_menu = new JPanel();
	
	private JMenuBar barra_principal = new JMenuBar();
	
	private JMenu menu_fuente = new JMenu("Fuente");
		private JMenuItem fuente_arial = new JMenuItem( new Change_font("Arial") );
		private JMenuItem fuente_courier = new JMenuItem( new Change_font("Courier") );
		private JMenuItem fuente_verdana = new JMenuItem( new Change_font("Verdana") );
	
	private JMenu menu_estilo = new JMenu("Estilo");
		private JMenuItem estilo_bold = new JMenuItem( new Change_style("Bold", Font.BOLD) );
		private JMenuItem estilo_italic = new JMenuItem( new Change_style("Italic", Font.ITALIC) );
	
	private JMenu menu_tamano = new JMenu("Tamaño");
		private JMenuItem tamano_12 = new JMenuItem("12");
		private JMenuItem tamano_14 = new JMenuItem("14");
		private JMenuItem tamano_16 = new JMenuItem("16");
		private JMenuItem tamano_18 = new JMenuItem("18");
	
	private JTextArea pagina = new JTextArea();
	//////////////////////////////////////////////////////////////////////////////////////
	
	//Constructor
	public Capa_principal() {
		setLayout( new BorderLayout() );
		
		agregar_elementos();
		
		pagina.setText("Se que te quiero y que me esperan muchos más aeropuertos");
		
		add(pagina, BorderLayout.CENTER);
		add(capa_menu, BorderLayout.NORTH);	
	}
	
	private void agregar_elementos() {
		capa_menu.add(barra_principal);
		barra_principal.add(menu_fuente);
			menu_fuente.add(fuente_arial);
			menu_fuente.add(fuente_courier);
			menu_fuente.add(fuente_verdana);
		barra_principal.add(menu_estilo);
			menu_estilo.add(estilo_bold);
			menu_estilo.add(estilo_italic);
		barra_principal.add(menu_tamano);
			menu_tamano.add(tamano_12);
			menu_tamano.add(tamano_14);
			menu_tamano.add(tamano_16);
			menu_tamano.add(tamano_18);
	}/////////////////////////////////////////////////////////////////
	
	//Eventos
	private class Change_font extends AbstractAction {
		public Change_font(String font_name) {
			putValue(NAME, font_name);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Font font = pagina.getFont();
			int style = font.getStyle();
			int size = font.getSize();
			
			pagina.setFont(new Font(getValue(NAME).toString(), style, size));			
		}	
	}
	
	private class Change_style extends AbstractAction {
		int add_style;
		
		public Change_style(String style_name, int style) {
			putValue(NAME, style_name);
			add_style = style;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Font font = pagina.getFont();
			String font_name = font.getFamily();
			int style = font.getStyle();
			int size = font.getSize();
			
			pagina.setFont(new Font(font_name, style^add_style, size));			
		}	
	}	
}
