package com.rajeshchinta.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObserverSwingExample {

	public static void main(String[] args) {
		ObserverSwingExample startApp = new ObserverSwingExample();
		startApp.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		
		frame.setAlwaysOnTop(true);
		frame.setTitle("ObserverPattern at work in Swing!");
		frame.add(button);
		frame.setVisible(true);
		
		// Here button is the subject, AngelListener, DevilListener are the observers.
		// 
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
	}
	
	public class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			System.out.println("AngelListener: Please don't do it, you will regret it.");
		}
		
	}
	
	public class DevilListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			System.out.println("DevilListener: Come on do it.");
		}
		
	}

}
