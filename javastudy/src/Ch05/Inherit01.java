package Ch05;

// 1. 재산을 물려받는 의미 (콤포지션을 해야함)


class Father{
	int money =10000;
}

class Son extends Father{
	int money =20000;
}


public class Inherit01 {
		
	public static void main(String[] args) {
		Son s = new Son();
		// 1. 변수를 찾을때 변수가 있으면 그 변수를 사용
		// 변수가 없으면 부모를 찾아올라간다.
		System.out.println(s.money);
		
		// 2. new 를 하면 Father과 Son의 heap에 뜬다.
		// 생성자는 Son()만 호출된다.
		// 가르키는 메모리 주소는 타입을 따라간다.
		Father f = new Son();
		System.out.println(f.money);
	}
}
