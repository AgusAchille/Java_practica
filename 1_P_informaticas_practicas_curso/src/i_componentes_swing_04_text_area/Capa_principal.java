package i_componentes_swing_04_text_area;


import java.awt.event.*;
import javax.swing.*;

public class Capa_principal extends JPanel{
	JTextArea area_1 = new JTextArea(8,20);
	JScrollPane scroll = new JScrollPane(area_1);
	JButton btn = new JButton("Texto");
	
	public Capa_principal() {
		area_1.setLineWrap(true);
		
		add(scroll);
		
		btn.addActionListener(new Accion());
		add(btn);
		
	}
	
	class Accion implements ActionListener {
		 
		@Override
		 public void actionPerformed(ActionEvent e) {
			 System.out.println(area_1.getText());
		 }
		
	}
}
