package ch02;


//자바는 .class파일을 실행하면 static 부분을 메모리에 로드(static공간에)
//static공간에 있는 main()함수를 찾아서 호출하고
//이때 stack이 생성되는 데 이stack의 이름을 main이라고한다
//main이 stack 종료되면 프로그램 종료.
public class Var01 {
	public static void main(String[] args) {
		//Code 부분
		System.out.println("첫번째");
		System.out.println("두번째");
	}//end of main
}
