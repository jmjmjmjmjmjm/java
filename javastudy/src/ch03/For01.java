package ch03;

public class For01 {

	public static void main(String[] args) {
		//�ݺ��� - > ������ �ݺ��Ǵ� ��
		//�ʱⰪ�� i =1 (for�� ������)
		//���ǽ��� i �� 5 ���� ���� ������ �ݺ��ϰ�
		//������ �ѹ� ����� �� ���� i �� 1�� ����
		
		//ù��° ������ �ʱⰪ ���� �� ���� Ȯ��
		//�ι�° �������ʹ� i�� ������ ����Ȯ��(�ݺ�)
		for (int i=1; i<5; i++) {		
			System.out.println("���� : "+i);
		}
		System.out.println();
		for (int i = 4; i >= 1; i--) {
			System.out.println("���� : "+i);
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.println("����: " +i);
		}
		System.out.println();
		
		//0���� 100������ �� �߿��� 3�� ����� ���

		for (int n =3;n<100;n+=3) {
			System.out.println("���� : " +n);
		}
		
	}

}