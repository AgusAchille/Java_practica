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
		private JCheckBoxMenuItem estilo_bold = new JCheckBoxMenuItem( new Change_bold("Bold", "assets/bold.png"));
		private JCheckBoxMenuItem estilo_italic = new JCheckBoxMenuItem( new Change_italic("Italic", "assets/italic.png") );
	
	private JMenu menu_tamano = new JMenu("Tamaño");
		private JRadioButtonMenuItem tamano_12 = new JRadioButtonMenuItem( new StyledEditorKit.FontSizeAction("12", 12));
		private JRadioButtonMenuItem tamano_14 = new JRadioButtonMenuItem( new StyledEditorKit.FontSizeAction("14", 14));
		private JRadioButtonMenuItem tamano_16 = new JRadioButtonMenuItem( new StyledEditorKit.FontSizeAction("16", 16));
		private JRadioButtonMenuItem tamano_20 = new JRadioButtonMenuItem( new StyledEditorKit.FontSizeAction("20", 20));
		ButtonGroup grupo_1 = new ButtonGroup();	
	
	private JTextPane pagina = new JTextPane();
	
	private JPopupMenu menu_secundario = new JPopupMenu();
	
	//--------------------------------------------------------------------------------------------------
	
	//Constructor
	public Capa_principal() {
		setLayout( new BorderLayout() );
		
		JButton hola = new JButton();
		
		agregar_elementos();
		
		pagina.setText("Se que te quiero y que me esperan muchos más aeropuertos");
		
		add(capa_menu, BorderLayout.NORTH);	
		add(pagina, BorderLayout.CENTER);
		
		//Atajos del teclado
		estilo_bold.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
		estilo_italic.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
		
		
	}//--------------------------------------------------------------------------------------------
	
	private void agregar_elementos() {
		menu_secundario.add(new JCheckBoxMenuItem( new Change_bold("Bold", "assets/bold.png")));
		menu_secundario.add(new JCheckBoxMenuItem( new Change_italic("Italic", "assets/italic.png")));
		pagina.setComponentPopupMenu(menu_secundario);
		
		grupo_1.add(tamano_12);
		grupo_1.add(tamano_14);
		grupo_1.add(tamano_16);
		grupo_1.add(tamano_20);
		
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
			menu_tamano.add(tamano_20);	
	}
	
	//////////////////////////////// --- Eventos Internos --- ///////////////////////////////
	
	class Change_italic extends StyledEditorKit.ItalicAction{
		public Change_italic(String style, String dir) {
			super();//no es necesario
			putValue(SMALL_ICON, new ImageIcon(dir));
			putValue(NAME,style);
			putValue(SHORT_DESCRIPTION,"Cambiar a itálica");
		}
	}
	
	class Change_bold extends StyledEditorKit.BoldAction{
		public Change_bold(String style, String dir) {
			super();//no es necesario
			putValue(SMALL_ICON, new ImageIcon(dir));
			putValue(NAME,style);
			putValue(SHORT_DESCRIPTION,"Cambiar a bold");
		}
	}
}