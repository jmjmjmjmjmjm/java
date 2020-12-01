package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch12.Gra01.MyPanel;

public class 그래픽예제3 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public 그래픽예제3() {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/image0.jpg");
		private Image img = icon.getImage();
		
		@Override
		protected void paintChildren(Graphics g) {
			super.paintChildren(g);
			
			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new 그래픽예제3();

	}

}
