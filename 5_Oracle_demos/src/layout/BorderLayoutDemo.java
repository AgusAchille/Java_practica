package layout;

/*
 * BorderLayoutDemo.java
 *
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

public class BorderLayoutDemo {
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void addComponentsToPane(Container pane) {
        
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        JButton button = new JButton("Button 1 (PAGE_START)");
        pane.add(button, BorderLayout.NORTH);
        
        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 100));
        pane.add(button, BorderLayout.CENTER);
        
        button = new JButton("Button 3 (LINE_START)");
        pane.add(button, BorderLayout.WEST);
        
        button = new JButton("Long-Named Button 4 (PAGE_END)");
        pane.add(button, BorderLayout.SOUTH);
        
        button = new JButton("5 (LINE_END)");
        pane.add(button, BorderLayout.EAST);
    }
    
    public static void main(String[] args) {

    	JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        
        frame.setBounds(100,100,800,600);
        frame.setVisible(true);
    }
}