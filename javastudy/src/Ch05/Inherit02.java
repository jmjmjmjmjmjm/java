package Ch05;

class ������{
	String name = "������";
}

class �ѱ��� extends ������{
	String name = " �ѱ���";
}

class �λ��� extends �ѱ���{
	String name = "�λ���";
}

public class Inherit02 {
	public static void main(String[] args) {
		// heap (�ѱ���,������) �����ʹ� (������)
		������ b = new �ѱ���();
		
		// 1. b�� �ѱ��� �������� �޸𸮿� �� �ֱ⶧����
		// �ٿ� ĳ���ð���
		�ѱ��� h =(�ѱ���) b;  //�ٿ�ĳ����   �޸𸮿� ���վ ������ �ٲ��ִ°�
		
		try {
			�λ��� busan = (�λ���) b;
		} catch (Exception e) {
			// �����ڰ� �ڵ鸵 �� ������.(�α�)
			System.out.println("�����߻��ߴµ� �����ص� ��");
		}
		
		
		
	}
}
