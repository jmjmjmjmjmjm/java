package composit;

import lombok.Data;

@Data

public class Potato {
		
	private int price;
	private String desc;
	
	public Potato(int price, String desc) {

		this.price = price;
		this.desc = desc;
		System.out.println("���ڰ� ����������ϴ�.");
	}
	
	public Potato() {
	this(1000,"����Ƣ��");
		
	}
	

}

