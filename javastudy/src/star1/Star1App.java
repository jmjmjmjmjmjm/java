//package star1;
//
//public class Star1App {
//
//	static void attack(Zealot u1,Dragon u2) {
//		System.out.println(u1.name +"->"+u2.name+"����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name+" :"+u2.hp);
//		
//	}
//	
//	static void attack(Dragon u1,Zealot u2) {
//		System.out.println(u1.name +"->"+u2.name+"����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name+ ":"+ u2.hp);
//		
//	}
//	static void attack(Dragon u1,Dragon u2) {
//		System.out.println(u1.name +"->"+u2.name+"����");
//		u2.hp = u2.hp - u1.attack; //90
//		System.out.println(u2.name +":"+ u2.hp);
//		
//	}
//	static void attack(Dark u1,Zealot u2) {
//		System.out.println(u1.name +"->"+u2.name+"����");
//		u2.hp = u2.hp - u1.attack;
//		System.out.println(u2.name +":"+ u2.hp);
//	}
//	
//	
//	public static void main(String[] args) {
//		Zealot z1 = new Zealot("����1",100,10);
//		Dragon d1= new Dragon("���1",100,20);
//		Dragon d2 =new Dragon("���2",100,20);
//		Dark dar1=new Dark("��ũ���÷�1",100,50);
//		
//		//1. ����1 - > ���1 ����
//		attack(z1,d1);
//		
//		//2. ���1->����1 ����
//		attack(d1,z1);
//		
//		//3.���1 -> ���2 ����
//		attack(d1,d2);
//		
//		//4.��ũ���÷�1 -> ����1 ���� (��ũ���÷�1,100,50)
//		attack(dar1,z1);
//		//5.��ũ���÷�2 -> ���1 ����
//		
//		
//	}
//
//}
