package b_exceptions_2_IOExceptions;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		new Ventana();
	}
}

class Layer_1 extends JPanel {
	Image image;
	
	public Layer_1() {
		
		try {
			image = ImageIO.read(new File("assets/guita.png"));
		} catch (IOException e) {
			System.out.println("No se pudo cargar la imagen");
		}
		
		
		
		
	}
	
	public Image getImage() throws IOException {
		
		return ImageIO.read(new File("assets/guita.png"));

	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(image== null)
			g.drawString("No se pudo cargar la imagen", 15, 15);
		else
			g.drawImage(image, 48, 48, null);
	}
}

class Ventana extends JFrame {
	public Ventana() {
		setBounds(200, 200, 250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new Layer_1());
		
		setVisible(true);
	}
}