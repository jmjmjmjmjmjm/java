package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {

	int x = 320;
	int y = 20;
	boolean isRunning =true;
	Container c;

	public Street02() {
		setTitle("��ǳ");
		setSize(900, 300);
		setLocationRelativeTo(null); // ����� ���߾ӿ� JFrame ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());
		setVisible(true);
	}

	class GamePanel extends JPanel { // �⺻�� �÷ο췹�̾ƿ�

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn = new JButton("����");
			add(btn);

			setFocusable(true); // ������ JFrame���� �δ°�

			addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					if (e.getKeyCode() == KeyEvent.VK_SPACE) {
						new Thread(new Runnable() {

							@Override
							public void run() {
								while (isRunning) {

									x = x + 10;
									repaint();
									try {
										Thread.sleep(50);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}

							}
						}).start();

					}
					if (e.getKeyCode() == KeyEvent.VK_RIGHT && x < 650) {
						x = x + 10;
					} else if (e.getKeyCode() == KeyEvent.VK_LEFT && x > 350) {
						x = x - 10;

					}
					repaint();

				}

			});

		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);

		}

	}

	public static void main(String[] args) {
		new Street02();

	}

}
