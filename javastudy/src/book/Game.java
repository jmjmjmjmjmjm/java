package book;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" };
		int n = (int) (Math.random() * 3);

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.println("가위 바위 보! >> ");
		Scanner scan = new Scanner(System.in);
		
		String m;
		m = scan.next();
		
		if (str[n] == m) {
			System.out.println("사용자 = " + m + "컴퓨터 = " + str[n] + "비겼습니다.");
		} 
		if (m == "가위") {
			if (str[n] == "바위") {
				System.out.println("사용자 = " + m + "컴퓨터 = " + str[n] + "졌습니다.");
			} else {
				System.out.println("사용자 = " + m + "컴퓨터 = " + str[n] + "이겻습니다.");
			}

		}
		if(m=="바위") {
			if (str[n]=="보") {
				System.out.println("사용자 = "+m+"컴퓨터 = "+str[n] +"졌습니다.");
			}else{
				System.out.println("사용자 = "+m+"컴퓨터 = "+str[n] +"이겻습니다.");
			}

		}
		if(m=="보") {
			if (str[n]=="바위") {
				System.out.println("사용자 = "+m+"컴퓨터 = "+str[n] +"졌습니다.");
			}else{
				System.out.println("사용자 = "+m+"컴퓨터 = "+str[n] +"이겻습니다.");
			}

		}
	}
}
