package star1;

//1. 질럿과 드라군,탱크,scv,다크템플러 => StarUnit 타입일치



public class Star3App {
	public static void main(String[] args) {
		StarUnit r= new Zealot();
		StarUnit d = new Dark();
		StarUnit.attack(r,d);
	}
}
