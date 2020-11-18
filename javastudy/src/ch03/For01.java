package ch03;

public class For01 {

	public static void main(String[] args) {
		//반복분 - > 스택이 반복되는 것
		//초기값은 i =1 (for문 시작전)
		//조건식은 i 가 5 보다 작을 떄까지 반복하고
		//스택이 한번 종료될 때 마다 i 가 1씩 증가
		
		//첫번째 루프는 초기값 설정 및 조건 확인
		//두번째 루프부터는 i값 변경후 조건확인(반복)
		for (int i=1; i<5; i++) {		
			System.out.println("숫자 : "+i);
		}
		System.out.println();
		for (int i = 4; i >= 1; i--) {
			System.out.println("숫자 : "+i);
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i+=2) {
			System.out.println("숫자: " +i);
		}
		System.out.println();
		
		//0부터 100까지의 수 중에서 3의 배수만 출력

		for (int n =3;n<100;n+=3) {
			System.out.println("숫자 : " +n);
		}
		
	}

}
