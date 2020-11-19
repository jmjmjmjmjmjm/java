package test;

import Ch05.BlueCloth;
import Ch05.Pactory;
import Ch05.RedCloth;

//protected는 같은 패키지+자식만 상속
public class PactoryApp {

	public static void main(String[] args) {
		Pactory f1 = new BlueCloth();
		Pactory f2 = new RedCloth();
//		f1.색칠(); //동적바인딩
//		f1.건조();
		f1.가동();
		f2.가동();
	}

}
