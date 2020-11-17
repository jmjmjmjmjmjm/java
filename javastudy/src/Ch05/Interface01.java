package Ch05;

// 1. 인터페이스는 new할수없다
// 2. 인터페이스는 변수를 가질수있다
// 3. 인터페이스는 추상메서드를 가진다. 그 메서드는 public abstract 이다
// 4. 인터페이스는 정상적인 메서드를 가질수없다.
// 5. 인터페이스를 구현하는 클래스는 반드시 오버라이딩해야함.

interface Remocon{
	String name ="리모컨"; //static과 final(읽기전용),public 이 생략되어있다.
	public abstract void control();
}

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
