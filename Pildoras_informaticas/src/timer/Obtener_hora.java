package timer;

import java.awt.event.*;
import java.util.*;

public class Obtener_hora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
			Date ahora = new Date();
			
			System.out.println(ahora);
	}
	
}
