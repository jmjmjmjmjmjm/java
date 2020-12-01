package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch12.�ǽ�1.MyPanel;

public class �׷��ȿ���1 extends JFrame {
	private MyPanel panel = new MyPanel();

	public �׷��ȿ���1() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);

		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(img, 20, 20, this);

		}

	}

	public static void main(String[] args) {
		new �׷��ȿ���1();
	}

}
