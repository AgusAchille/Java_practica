package procesador_de_texto;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class asdasd {
	static int num = 20;

	public static void main(String[] args) {
		JFrame vent = new JFrame();
		
		vent.setBounds(200,200,100,150);
		vent.setVisible(true);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel capa_1 = new JPanel();
		
		String agus;
		JButton boton = new JButton( new AbstractAction("hola") {

			@Override
			public void actionPerformed(ActionEvent e) {
				num ^= 4;
				System.out.println(num);
				
			}
			
		});
		
		capa_1.add(boton);
		vent.add(capa_1);
		

	}
	

}
