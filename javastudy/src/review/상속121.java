package review;

//�ڹٴ� �Լ��� ������� ����. 
//���ϱ� �Լ��� ����� ����. -> ���ϱ� �Լ� ������� Ŭ������ �ʿ���.
//�������̽��� �͸�Ŭ����(�Լ� �����Ǿ����)�� ����� �ִ�.
interface A {
	void add();
}

public class ���121 {

	public static void main(String[] args) {
		new A() {

			@Override
			public void add() {
				System.out.println("���ϱ�");

			}
		}.add();
		
	}

}
