package coffee;

import lombok.Data;

//책임 : 없음

@Data
public class 커피 {
	private String name;
	
	public 커피() {
		this.name = "아메리카노";
	}
}
