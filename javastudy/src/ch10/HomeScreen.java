package ch10;

import java.awt.Font;

import javax.swing.JFrame;

public class HomeScreen extends JFrame{
	
	private HomeScreen homeScreen =this;
	private LoginScreen loginScreen;
	
	
	public HomeScreen(LoginScreen loginScreen) {
		
		
		setTitle("HOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		setVisible(true);
	}
	
}