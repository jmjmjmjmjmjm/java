package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch12.실습1.MyPanel;

public class 그래픽예제1 extends JFrame {
	private MyPanel panel = new MyPanel();

	public 그래픽예제1() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
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
		new 그래픽예제1();
	}

}
