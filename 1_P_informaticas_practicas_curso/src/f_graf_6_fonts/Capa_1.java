package f_graf_6_fonts;

import javax.swing.*;
import java.awt.*;

public class Capa_1 extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		setBackground(Color.BLACK);

		Graphics2D g2D = (Graphics2D) g;

//		g2D.setRenderingHint(
//		        RenderingHints.KEY_TEXT_ANTIALIASING,
//		        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);	

//		g2D.setRenderingHint(
//		        RenderingHints.KEY_TEXT_ANTIALIASING,
//		        RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

		Font mi_fuente = new Font("Montserrat", Font.PLAIN, 26);
		
		g2D.setColor(new Color(100, 250, 200));
		
		
		g2D.setFont(mi_fuente);
		g2D.drawString("Agustín", 100, 100);
		
		g2D.setFont(new Font("Arial", Font.ITALIC, 12));
		g2D.drawString("Patricio", 300, 200);
		
		//Método 1 de anti-alising  para texto
		g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2D.setFont(mi_fuente);
		g2D.drawString("Agustín", 100, 130);
		
		g2D.setFont(new Font("Arial", Font.ITALIC, 12));
		g2D.drawString("Patricio", 300, 215);

		//Método 2 de anti-alising para texto
		g2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
		g2D.setFont(mi_fuente);
		g2D.drawString("Agustín", 100, 160);
		
		g2D.setFont(new Font("Arial", Font.ITALIC, 12));
		g2D.drawString("Patricio", 300, 230);

	}

}
