package book;

import lombok.Getter;

public class BookApp {
	public static void main(String[] args) {
		
		First robot =  new First();
		robot.kick=10;
		robot.punch=20;
		
		System.out.println(robot.getKick());
		System.out.println(robot.getPunch());
		
	}

}
