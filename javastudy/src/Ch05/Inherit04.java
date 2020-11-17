package Ch05;

//인터페이스는 new할 수 없다. 왜냐면 추상메서드를 가졌기 때문에.
//약속을 만드는 값
interface Animal2{
	void sound(); //추상 메서드 실행해도 어차피안됨  (함수의 몸체가 없다)
}

class Dog2 implements Animal2{
	public void sound() {
		System.out.println("멍멍");
	}
}

class Monkey implements Animal2{
	public void sound() {
		System.out.println("몽몽");
	}
}

//Monkey 클래스를 만들고 (몽몽) 출력하고
// 반드시 Anumal2를 구현하세요.

class Cat2 implements Animal2{
	public void sound() {
		System.out.println("냐옹");
	}
}

class Bird2 implements Animal2{
	public void sound() {
		System.out.println("짹짹");
	}
}
/////////////////////////////////////////

public class Inherit04 {
	static void start(Animal2 a) {
		a.sound();
	}
	
	public static void main(String[] args) {
		//자기 자신의 클래스의 static 을 호출할 때는 클래스명 생략가능
		start(new Dog2());
		start(new Monkey());
	}
	
}
