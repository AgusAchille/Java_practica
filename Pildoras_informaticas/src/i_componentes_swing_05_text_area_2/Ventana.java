package i_componentes_swing_05_text_area_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame{
	JPanel capa_2 = new JPanel();
	
	JButton btn_insertar = new JButton("Insertar");
	JButton btn_salto = new JButton("Quitar Salto");
	
	JTextArea area_1 = new JTextArea(15,30);
	JScrollPane scroll = new JScrollPane(area_1);
	
	public Ventana() {
		setBounds(200,200,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
				
		add(scroll, BorderLayout.CENTER);
		add(capa_2, BorderLayout.SOUTH);
		
		capa_2.add(btn_insertar);
		capa_2.add(btn_salto);
		
		area_1.setLineWrap(true);
		
		//Agregar acciones a los botones
		btn_insertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area_1.append("Agustin ");
				
			}
		});
		
		btn_salto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean salto = area_1.getLineWrap();
				area_1.setLineWrap(!salto);
				
				btn_salto.setText(salto ? "Agregar Salto" : "Quitar Salto");
			}
		});		
		
		setVisible(true);
	}
}