package procesador_de_texto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Capa_principal extends JPanel{
	private enum Font_prop{
		FAMILY, STYLE, SIZE
	}
	
	//Variables
	private JPanel capa_menu = new JPanel();
	
	private JMenuBar barra_principal = new JMenuBar();
	
	private JMenu menu_fuente = new JMenu("Fuente");
		private JMenuItem fuente_arial = new JMenuItem( new Change_font("Arial", Font_prop.FAMILY) );
		private JMenuItem fuente_courier = new JMenuItem( new Change_font("Courier", Font_prop.FAMILY) );
		private JMenuItem fuente_verdana = new JMenuItem( new Change_font("Verdana", Font_prop.FAMILY) );
	
	private JMenu menu_estilo = new JMenu("Estilo");
		private JMenuItem estilo_bold = new JMenuItem( new Change_font("Bold", Font.BOLD, Font_prop.STYLE) );
		private JMenuItem estilo_italic = new JMenuItem( new Change_font("Italic", Font.ITALIC, Font_prop.STYLE) );
	
	private JMenu menu_tamano = new JMenu("Tamaño");
		private JMenuItem tamano_12 = new JMenuItem( new Change_font("12", Font_prop.SIZE));
		private JMenuItem tamano_14 = new JMenuItem( new Change_font("14", Font_prop.SIZE));
		private JMenuItem tamano_16 = new JMenuItem( new Change_font("18", Font_prop.SIZE));
		private JMenuItem tamano_18 = new JMenuItem( new Change_font("20", Font_prop.SIZE));
	
	private JTextPane pagina = new JTextPane();
	//--------------------------------------------------------------------------------------------------
	
	//Constructor
	public Capa_principal() {
		setLayout( new BorderLayout() );
		
		agregar_elementos();
		
		pagina.setText("Se que te quiero y que me esperan muchos más aeropuertos");
		
		add(capa_menu, BorderLayout.NORTH);	
		add(pagina, BorderLayout.CENTER);
	}//--------------------------------------------------------------------------------------------
	
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
	}
	
	//Eventos
	private class Change_font extends AbstractAction {
		Font_prop category;
		int add_style;
		
		public Change_font(String font_name, Font_prop category) {
			this.category = category;
			putValue(NAME, font_name);
		}
		
		public Change_font(String style_name, int style, Font_prop category) {
			add_style = style;
			this.category = category;
			putValue(NAME, style_name);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Font font = pagina.getFont();
			String font_name = font.getFamily();
			int style = font.getStyle();
			int size = font.getSize();
			
			switch(category) {
				case FAMILY:
					pagina.setFont(new Font(getValue(NAME).toString(), style, size));		
					break;
					
				case STYLE:
					pagina.setFont(new Font(font_name, style^add_style, size));			
					break;
					
				case SIZE:
					size = Integer.parseInt(getValue(NAME).toString());
					pagina.setFont(new Font(font_name, style, size));			
			}			
		}	
	}
}