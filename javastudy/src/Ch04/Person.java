package Ch04;

public class Person { //�⺻������ -> Ŭ������() -> ���������ϴ�.
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	public Person() { //����Ʈ �����ڴ� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� �������.
						//���࿡ �����ڰ� ������ ����Ʈ �����ڸ� ��������� ����
						//�� ����� ����Ʈ �����ڸ� ���� ����������.(�����ε�)
	}
	public Person(String n, String j, int a, char g , String b) {//�ʱ�ȭ�� ���� ������(�ʱ�ȭ�� ���� �Լ�)
		System.out.println("����� �¾");
		name = n;
		job =j;
		age = a;
		gender =g;
		blood =b;
	}
	
	void preview() {
		System.out.println("===="+name + "====");
		System.out.println("���� :" +job);
		System.out.println("���� :" +age);
		System.out.println("���� :" +gender);
		System.out.println("������ : "+blood);
		System.out.println();
	}
	
}