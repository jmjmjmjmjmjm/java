package review;

public class 스택과지역변수_09 {

	// 스택 : 함수마다 가지고있음.
	// 오픈 : 함수의 호출시
	void add() { // 함수 내부 = 중괄호 내부 = {} = stack이 오픈된다고함.
		int n1 = 10; // add()함수 스택에 4Byte가 할당됨.

	} //함수종료 -> 점프후 복귀 = stack이 사라짐 =변수가 지역적 =지역변수

	public static void main(String[] args) {
		스택과지역변수_09 e = new 스택과지역변수_09();
		e.add(); //n1이 메모리에 떠잇음.
	}

}
