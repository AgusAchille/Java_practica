package procesador_de_texto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class Capa_principal extends JPanel{
	//Colores
	Color red = new Color(247, 143, 143);
	Color green = new Color(186, 224, 189);
	Color blue = new Color(139, 183, 240);
	Color yellow = new Color(255, 238, 163);
	
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
	
	private JToolBar tool_bar = new JToolBar();
	//--------------------------------------------------------------------------------------------------
	
	//Constructor
	public Capa_principal() {
		setLayout( new BorderLayout() );
		pagina.setBackground(new Color(50,50,50));
		pagina.setForeground(new Color(210,210,210));
		
		pagina.setText("Se que te quiero y que me esperan muchos más aeropuertos");
		
		//Layout
		add(capa_menu, BorderLayout.NORTH);	
		add(pagina, BorderLayout.CENTER);
		add(tool_bar, BorderLayout.WEST);
		tool_bar.setOrientation(JToolBar.VERTICAL);
		//Atajos del teclado
		estilo_bold.setAccelerator(KeyStroke.getKeyStroke("ctrl B"));
		estilo_italic.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
		
		run_code();
		
	}//--------------------------------------------------------------------------------------------
	
	private void run_code() {
		pagina.setComponentPopupMenu(menu_secundario);
			menu_secundario.add(new JCheckBoxMenuItem( new Change_bold("Bold", "assets/bold.png")));
			menu_secundario.add(new JCheckBoxMenuItem( new Change_italic("Italic", "assets/italic.png")));
		
		grupo_1.add(tamano_12);
		grupo_1.add(tamano_14);
		grupo_1.add(tamano_16);
		grupo_1.add(tamano_20);
		
		capa_menu.add(barra_principal);
			barra_principal.add(menu_fuente);
				menu_fuente.add(fuente_arial);
				menu_fuente.add(new StyledEditorKit.FontFamilyAction("Courier", "Courier"));
				menu_fuente.add(fuente_verdana);
			barra_principal.add(menu_estilo);
				menu_estilo.add(estilo_bold);
				menu_estilo.add(estilo_italic);
			barra_principal.add(menu_tamano);
				menu_tamano.add(tamano_12);
				menu_tamano.add(tamano_14);
				menu_tamano.add(tamano_16);
				menu_tamano.add(tamano_20);
		
		//ToolBar
		tool_bar.add(new Change_bold("Bold", "assets/theme/bold.png") );
		tool_bar.add(new Change_italic("Italic", "assets/theme/italic.png") );
		tool_bar.add(new Change_underline("Underline", "assets/theme/underline.png") );
		
		tool_bar.addSeparator();
		
		tool_bar.add(new Change_color("Red", red, "assets/theme/red.png"));
		tool_bar.add(new Change_color("Green", green, "assets/theme/green.png"));
		tool_bar.add(new Change_color("Blue", blue, "assets/theme/blue.png"));
		tool_bar.add(new Change_color("Yellow", yellow, "assets/theme/yellow.png"));
		
		tool_bar.addSeparator();
		
		tool_bar.add(new Change_align("Left", 0, "assets/theme/left.png"));
		tool_bar.add(new Change_align("Center", 1, "assets/theme/center.png"));
		tool_bar.add(new Change_align("Right", 2, "assets/theme/right.png"));
		tool_bar.add(new Change_align("Justify", 3, "assets/theme/justify.png"));
	}
	
	//////////////////////////////// --- Eventos Internos --- ///////////////////////////////
	class Change_align extends StyledEditorKit.AlignmentAction {
		public Change_align(String nombre, int alineacion, String icon) {
			super(nombre, alineacion);
			putValue(SMALL_ICON, new ImageIcon(icon));
		}
	}
	
	class Change_color extends StyledEditorKit.ForegroundAction {
		public Change_color(String nombre, Color color, String icon) {
			super(nombre, color);
			putValue(SMALL_ICON, new ImageIcon(icon));
		}
	}
	
	class Change_italic extends StyledEditorKit.ItalicAction{
		public Change_italic(String style, String icon) {
			super();//no es necesario
			putValue(SMALL_ICON, new ImageIcon(icon));
			putValue(NAME,style);
			putValue(SHORT_DESCRIPTION,"Cambiar a itálica");
		}
	}
	
	class Change_bold extends StyledEditorKit.BoldAction{
		public Change_bold(String style, String icon) {
			super();//no es necesario
			putValue(SMALL_ICON, new ImageIcon(icon));
			putValue(NAME,style);
			putValue(SHORT_DESCRIPTION,"Cambiar a bold");
		}
	}
	
	class Change_underline extends StyledEditorKit.UnderlineAction{
		public Change_underline(String style, String icon) {
			super();//no es necesario
			putValue(SMALL_ICON, new ImageIcon(icon));
			putValue(NAME,style);
			putValue(SHORT_DESCRIPTION,"Cambiar a itálica");
		}
	}
}