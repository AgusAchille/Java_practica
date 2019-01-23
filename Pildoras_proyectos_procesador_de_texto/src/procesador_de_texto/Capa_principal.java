package procesador_de_texto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.text.StyledEditorKit;

public class Capa_principal extends JPanel{
	//Variables
	private JPanel capa_menu = new JPanel();
	
	private JMenuBar barra_principal = new JMenuBar();
	
	private JMenu menu_fuente = new JMenu("Fuente");
		private JMenuItem fuente_arial = new JMenuItem( new StyledEditorKit.FontFamilyAction("Arial", "Arial") );
		private JMenuItem fuente_courier = new JMenuItem( new StyledEditorKit.FontFamilyAction("Courier", "Courier") );
		private JMenuItem fuente_verdana = new JMenuItem( new StyledEditorKit.FontFamilyAction("Verdana", "Verdana") );
	
	private JMenu menu_estilo = new JMenu("Estilo");
		private JMenuItem estilo_bold = new JMenuItem( new Cambiar_bold("Bold"));
		private JMenuItem estilo_italic = new JMenuItem( new Cambiar_italica("Italic") );
	
	private JMenu menu_tamano = new JMenu("Tamaño");
		private JMenuItem tamano_12 = new JMenuItem( new StyledEditorKit.FontSizeAction("12", 12));
		private JMenuItem tamano_14 = new JMenuItem( new StyledEditorKit.FontSizeAction("16", 16));
		private JMenuItem tamano_16 = new JMenuItem( new StyledEditorKit.FontSizeAction("18", 18));
		private JMenuItem tamano_18 = new JMenuItem( new StyledEditorKit.FontSizeAction("20", 20));
	
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
	
	class Cambiar_italica extends StyledEditorKit.ItalicAction{
		public Cambiar_italica(String style) {
			super();//no es necesario
			putValue(NAME,style);
		}
	}
	
	class Cambiar_bold extends StyledEditorKit.BoldAction{
		public Cambiar_bold(String style) {
			super();//no es necesario
			putValue(NAME,style);
		}
	}
	
}