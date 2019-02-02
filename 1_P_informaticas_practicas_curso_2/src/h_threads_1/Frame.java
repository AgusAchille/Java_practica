package h_threads_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
	//Layers
	private Layer_ball layer_ball = new Layer_ball();
	private JPanel layer_btns = new JPanel();

	//Buttons
	private JButton btn_start = new JButton( new Btn_actions("Start"));
	private JButton btn_exit = new JButton( new Btn_actions("Exit"));
	
	//Constructor
	public Frame() {
		setBounds(600, 300, 400, 350);
		setTitle("Rebotes");
		
		add(layer_ball, BorderLayout.CENTER);
		
		add(layer_btns, BorderLayout.SOUTH);
			layer_btns.add(btn_start);
			layer_btns.add(btn_exit);		
	}
	
	//Actions Classes
	private class Btn_actions extends AbstractAction{
		public Btn_actions(String name) {
			putValue(NAME, name);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
				case "Start":
						Thread ball_thread = new Thread(new Ball_runner());
						ball_thread.start();						
					break;
					
				case "Exit":
					System.exit(0);
			}
		}
	}
	
	class Ball_runner implements Runnable{		
		@Override
		public void run() {
				layer_ball.startGame();						
			
		}		
	}
}
