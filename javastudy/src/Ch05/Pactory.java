package Ch05;
//�߻�Ŭ����

public abstract class Pactory {
	//protected = �ڽĸ� ã�����ְ�
	protected abstract void ��ĥ();
	protected void ����() {
		System.out.println("���� �Ϸ�.");
	}
	
	public void ����() {
		��ĥ();
		����();
	}
	
}