package star1;


public class StarUnit {
	String name;
	int attack;
	int hp;
	
	public static void attack(StarUnit u1 ,StarUnit u2) {
		System.out.println(u1.name + "->" +u2.name+"����");
		u2.hp-=u1.attack;
		System.out.println(u2.name+"hp" + u2.hp);
		System.out.println("===============");
	}

}
