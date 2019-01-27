package i_componentes_swing_08_radio_button_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Capa_principal extends JPanel {
	private JLabel texto;
	private ButtonGroup grupo = new ButtonGroup();
	private JPanel capa_1 = new JPanel();

	public Capa_principal() {
		setLayout(new BorderLayout());
		texto = new JLabel("Atención pido al silencio y silencio a la atención...");
		texto.setFont(new Font("Pacifico", Font.PLAIN, 14));
		
		add(texto, BorderLayout.CENTER);

		colocar_botones("Small", false, 12);
		colocar_botones("Medium", true, 14);
		colocar_botones("Large", false, 16);
		colocar_botones("Extra Large", false, 18);

		add(capa_1, BorderLayout.SOUTH);
	}
	
	private void colocar_botones(String nombre, boolean select, int size) {
		JRadioButton btn = new JRadioButton(nombre, select);
		grupo.add(btn);
		capa_1.add(btn);
		
		ActionListener nuevo_estilo = new ActionListener() {						
			@Override
			public void actionPerformed(ActionEvent e) {
				String font_family = texto.getFont().getFamily();
				int style = texto.getFont().getStyle();
				
				texto.setFont(new Font(font_family, style, size));
			}
		};
		
		btn.addActionListener(nuevo_estilo);
		
		//btn.addActionListener(new Cambiar_estilo(size));
		
	}
	
	/*
	class Cambiar_estilo implements ActionListener {
		int size;
		
		public Cambiar_estilo(int size) {
			this.size = size;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String font_family = texto.getFont().getFamily();
			int style = texto.getFont().getStyle();
			
			texto.setFont(new Font(font_family, style, size));
		}
	}
	*/
}
