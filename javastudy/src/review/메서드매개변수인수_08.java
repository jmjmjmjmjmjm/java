package review;

public class 메서드매개변수인수_08 {

	// void 리턴이없다. add는 변수이름,()은 함수라는뜻
	// int n1,int n2 매개변수(arguments)
	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	int minus(int n1, int n2) {
		return n1-n2; //함수를 호출한 문장의 값이 n1-n2로 변경
	}

	public static void main(String[] args) {
		메서드매개변수인수_08 e = new 메서드매개변수인수_08();
		// 3과5를 인수라고부름.
		e.add(3, 5); // 점프후 여기라인으로 돌아옴.
		
		int result = e.minus(10,1);
		System.out.println("result : " +result);
	}

}
