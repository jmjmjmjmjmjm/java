package Ch05;

//�������̽��� new�� �� ����. �ֳĸ� �߻�޼��带 ������ ������.
//����� ����� ��
interface Animal2{
	void sound(); //�߻� �޼��� �����ص� �����Ǿȵ�  (�Լ��� ��ü�� ����)
}

class Dog2 implements Animal2{
	public void sound() {
		System.out.println("�۸�");
	}
}

class Monkey implements Animal2{
	public void sound() {
		System.out.println("����");
	}
}

//Monkey Ŭ������ ����� (����) ����ϰ�
// �ݵ�� Anumal2�� �����ϼ���.

class Cat2 implements Animal2{
	public void sound() {
		System.out.println("�Ŀ�");
	}
}

class Bird2 implements Animal2{
	public void sound() {
		System.out.println("±±");
	}
}
/////////////////////////////////////////

public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	
	public static void main(String[] args) {
		//�ڱ� �ڽ��� Ŭ������ static �� ȣ���� ���� Ŭ������ ��������
		start(new Dog2());
		start(new Monkey());
	}
	
}