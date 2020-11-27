package ch11;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class platics extends JFrame{
	public platics() {
		setTitle("체크박스");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JLabel btn1 = new JLabel("dsdasd");
		c.add(btn1, SwingConstants.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new platics();
	}

}
