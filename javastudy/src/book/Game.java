package book;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String str[] = { "����", "����", "��" };
		int n = (int) (Math.random() * 3);

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		System.out.println("���� ���� ��! >> ");
		Scanner scan = new Scanner(System.in);
		
		String m;
		m = scan.next();
		
		if (str[n] == m) {
			System.out.println("����� = " + m + "��ǻ�� = " + str[n] + "�����ϴ�.");
		} 
		if (m == "����") {
			if (str[n] == "����") {
				System.out.println("����� = " + m + "��ǻ�� = " + str[n] + "�����ϴ�.");
			} else {
				System.out.println("����� = " + m + "��ǻ�� = " + str[n] + "�̰���ϴ�.");
			}

		}
		if(m=="����") {
			if (str[n]=="��") {
				System.out.println("����� = "+m+"��ǻ�� = "+str[n] +"�����ϴ�.");
			}else{
				System.out.println("����� = "+m+"��ǻ�� = "+str[n] +"�̰���ϴ�.");
			}

		}
		if(m=="��") {
			if (str[n]=="����") {
				System.out.println("����� = "+m+"��ǻ�� = "+str[n] +"�����ϴ�.");
			}else{
				System.out.println("����� = "+m+"��ǻ�� = "+str[n] +"�̰���ϴ�.");
			}

		}
	}
}