package j_advanced_layouts_5_Layout_propio;

import java.awt.*;

public class In_columns implements LayoutManager{
	
	@Override
	public void addLayoutComponent(String arg0, Component arg1) {	
	}

	@Override
	public void layoutContainer(Container c) {
	
		int x= c.getWidth() / 2;
		int y=20;
		
		//Cantidad de elementos agregados al container (JPanel, JFrame) que tiene el layout.
		int components_added = c.getComponentCount();
		
		for (int i=0; i<components_added; i++) {
			Component component = c.getComponent(i);
			
			component.setBounds(x-90, y, 100, 20);
			
			x+=80;
			if(i%2==1) {
				x= c.getWidth() / 2;
				y+=30;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container c) {
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container c) {
		return null;
	}

	@Override
	public void removeLayoutComponent(Component c) {
		
	}
}