package test;

import Ch05.BlueCloth;
import Ch05.Pactory;
import Ch05.RedCloth;

//protected�� ���� ��Ű��+�ڽĸ� ���
public class PactoryApp {

	public static void main(String[] args) {
		Pactory f1 = new BlueCloth();
		Pactory f2 = new RedCloth();
//		f1.��ĥ(); //�������ε�
//		f1.����();
		f1.����();
		f2.����();
	}

}
