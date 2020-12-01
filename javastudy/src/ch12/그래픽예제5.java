package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 그래픽예제5 extends JFrame {
	private MyPanel panel = new MyPanel();

	public 그래픽예제5() {
		setTitle("drawing line by Mouse 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();

		public MyPanel() {
			addMouseListener(new MouseAdapter() {

				@Override
				public void mouseReleased(MouseEvent e) {
					Point endp = e.getPoint();
					vEnd.add(endp);
					repaint();
				}

				@Override
				public void mousePressed(MouseEvent e) {

					Point startP = e.getPoint();
					vStart.add(startP);

				}

			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);

			for (int i = 0; i < vStart.size(); i++) {

				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);

				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}

	}

	public static void main(String[] args) {
		new 그래픽예제5();
	}

}
