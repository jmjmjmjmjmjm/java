package coffee;

//고객
//책임 : 주문() , 먹기()
public class 고객 {
	
	public void order(바리스타 b1) {

		//바리스타에게 메시지를 보냄
		커피 c= b1.makeCoffee();
		System.out.println(c.getName() + " 나왔습니다.");
	}
	
}
