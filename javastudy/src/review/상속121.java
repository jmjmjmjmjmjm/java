package review;

//자바는 함수만 만들수가 없다. 
//더하기 함수를 만들고 싶음. -> 더하기 함수 만들려면 클래스가 필요함.
//인터페이스로 익명클래스(함수 구현되어야함)를 만들수 있다.
interface A {
	void add();
}

public class 상속121 {

	public static void main(String[] args) {
		new A() {

			@Override
			public void add() {
				System.out.println("더하기");

			}
		}.add();
		
	}

}
