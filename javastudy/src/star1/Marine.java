package star1;

class Marine {
	
	//맴버변수 : 필드 : heap변수 : 전역변수 : 속성 : 프로퍼티
	//field,property 는 private로 만든다. 마법x
	private String name;
	private int hp;
	private int attack;
	
	//alt+shift+S
	public Marine(String name, int hp, int attack) {
		this.name = name; //this는 heap을 가르킨다
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {
		
	}
	
	
}
