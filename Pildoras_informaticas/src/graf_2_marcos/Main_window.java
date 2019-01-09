package graf_2_marcos;

import java.awt.Graphics;

import javax.swing.*;

public class Main_window extends JFrame{
	public Main_window() {
		
		setSize(400,400);
		setLocation(0, 0);
		setTitle("escribiendo");
		
		Capa1 capa1 = new Capa1("Fernando",100,100);
		add(capa1);
		
	}
}
