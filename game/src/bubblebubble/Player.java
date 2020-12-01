package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	private Player player = this;
	private final static String TAG = "Player : ";

	private ImageIcon ic_PlayerR, ic_PlayerL;
	public int x = 55; // �Ʊ� �ɸ��� ��ǥ
	public int y = 535;

	public boolean isRight = false; // ����(�����������մ���)
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;

	public int floor = 1; // 535,415,295,177 (����)

	public Player() {
		ic_PlayerR = new ImageIcon("images/playerR.png");
		ic_PlayerL = new ImageIcon("images/playerL.png");
		setIcon(ic_PlayerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void moveRight() {

		if (isRight == false) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					setIcon(ic_PlayerR);
					isRight = true;
					while (isRight) {
						x++;

						setLocation(x, y); // ���ο� repaint()�� ����
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}).start();
		}

	}

	public void moveLeft() {

		if (isLeft == false) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					setIcon(ic_PlayerL);
					isLeft = true;
					while (isLeft) {
						x--;

						setLocation(x, y); // ���ο� repaint()�� ����
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

				}
			}).start();
		}

	}

	public void moveUp() {
		System.out.println(TAG + "moveUp()");
		if (isUp == false) {

			new Thread(new Runnable() {

				@Override
				public void run() {
					isUp=true;
					for (int i = 0; i < 140; i++) {
						y--;
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					moveDown();

				}
			}).start();
		}
	}

	public void moveDown() {
		System.out.println(TAG + "moveDown()");
		if (isDown == false) {

			new Thread(new Runnable() {

				@Override
				public void run() {
					isDown=true;
					for (int i = 0; i < 140; i++) {
						y++;
						setLocation(x, y);
						if (floor == 1 && y > 535) { // 1���϶�,x��ǥ�� ����ؼ�����������
							break;
						}

						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
					isUp=false;
					isDown=false;
				}
			}).start();
		}
	}

	public void moveJump() {
		moveUp();
	}

	public void attack() {

	}
}
