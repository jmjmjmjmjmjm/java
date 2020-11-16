package Ch04;

public class Person { //기본생성자 -> 클래스명() -> 생략가능하다.
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	public Person() { //디폴트 생성자는 생성자가 하나도 없으면 컴파일러가 자동으로 만들어줌.
						//만약에 생성자가 있으면 디폴트 생성자를 만들어주지 않음
						//이 경웅는 디폴트 생성자를 직접 만들어줘야함.(오버로딩)
	}
	public Person(String n, String j, int a, char g , String b) {//초기화를 위한 생성자(초기화를 위한 함수)
		System.out.println("사람이 태어남");
		name = n;
		job =j;
		age = a;
		gender =g;
		blood =b;
	}
	
	void preview() {
		System.out.println("===="+name + "====");
		System.out.println("직업 :" +job);
		System.out.println("나이 :" +age);
		System.out.println("성별 :" +gender);
		System.out.println("혈액형 : "+blood);
		System.out.println();
	}
	
}
