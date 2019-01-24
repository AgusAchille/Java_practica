package i_componentes_swing_15_Menu_emergente;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class Capa_principal extends JPanel{

	public Capa_principal() {
		setLayout( new BorderLayout());
		
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion_1 = new JMenuItem("Opción 1");
		emergente.add(opcion_1);
		
		emergente.add( new JMenuItem("opcion"));
		emergente.add( new JMenuItem("opcion"));
		emergente.add( new JMenuItem("opcion"));
		
		
		JPanel capa_1 = new JPanel();
		
		add(capa_1, BorderLayout.NORTH);
		
		
		capa_1.setBackground(new Color(150,200,100));
		
		JButton hola = new JButton("hola");
		capa_1.add(hola);
		
		
		capa_1.setComponentPopupMenu(emergente);
		
		
	}

}
