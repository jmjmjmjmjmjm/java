package ch12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 실습1 extends JFrame {

	private Container c = getContentPane();
	private MyPanel panel = new MyPanel();
	String[] chart = { "100", "80", "60", "50", "40", "20" };

	public 실습1() {

		c.setLayout(new BorderLayout());
		JButton btn = new JButton("버튼");
		c.add(panel, BorderLayout.CENTER);
		c.add(btn, BorderLayout.SOUTH);

		

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.paintComponent(getGraphics());
				repaint();
			}
		});
		setSize(800, 800);
		setVisible(true);
	}

	class openbutton extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			g.drawLine(100, 0, 100, 100);
			g.drawLine(200, 0, 200, 200);
			g.drawLine(300, 0, 300, 300);
			g.drawLine(400, 0, 400, 400);
			g.drawLine(500, 0, 500, 500);
		}
	}

	class MyPanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.drawString(chart[0], 10, 100); // 100
			g.drawString(chart[1], 10, 200); // 80
			g.drawString(chart[2], 10, 300); // 60
			g.drawString(chart[3], 10, 400); // 50
			g.drawString(chart[4], 10, 500); // 40
			g.drawString(chart[5], 10, 600); // 20
		}
		
	}
	
	public static void main(String[] args) {
		new 실습1();

	}

}
