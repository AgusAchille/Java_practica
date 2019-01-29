package a_export_jar;

import java.awt.GridLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	public Ventana() {
		URL ruta_icon = Ventana.class.getResource("assets/play.png");
		
		JPanel ventana2 = new JPanel();
		
		setLayout(new GridLayout(2,2));
		setBounds(200,200,200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon(ruta_icon);
		add(new JButton(icon));
		add(new JButton(icon));
		add(new JButton(icon));
		add(new JButton(icon));
		
		
		setVisible(true);
	}
}
