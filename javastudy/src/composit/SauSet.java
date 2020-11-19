package composit;

import lombok.Data;

@Data
public class SauSet {
	private Shrimp burger;
	private Potato potato;
	private Coke coke;
	
	public SauSet(Shrimp burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
	public SauSet() {
		this(
			new Shrimp(),
			new Potato(),
			new Coke()
		);
	}
	
}