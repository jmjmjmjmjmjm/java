package composit;

import lombok.Data;

@Data

public class Burger {
		
	private int price;
	private String desc;
	
	public Burger(int price, String desc) {

		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}
	
	public Burger() {
	this(1000,"기본버거");
	System.out.println("기본버거가 만들어졌습니다.");
	}
}
