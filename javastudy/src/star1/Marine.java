package star1;

class Marine {
	
	//�ɹ����� : �ʵ� : heap���� : �������� : �Ӽ� : ������Ƽ
	//field,property �� private�� �����. ����x
	private String name;
	private int hp;
	private int attack;
	
	//alt+shift+S
	public Marine(String name, int hp, int attack) {
		this.name = name; //this�� heap�� ����Ų��
		this.hp = hp;
		this.attack = attack;
	}
	
	public Marine() {
		
	}
	
	
}