package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gra02 extends JFrame {

	private MyPanel panel;
	int x = 10;
	int y = 10;

	public Gra02() {
		setTitle("rePaint 예제");
		setSize(400, 500);

		panel = new MyPanel(); // 기존패널을 바꿔끼움 페인트컴포넌트를 오버라이딩하려고
		setContentPane(panel);
		setVisible(true);
	}

	class MyPanel extends JPanel {

		public MyPanel() {
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					System.out.println("x : " + x);
					System.out.println("y : " + y);
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(x, y, 50, 50);
		}
	}

	public static void main(String[] args) {
		new Gra02();

	}

}
