package ch03;

import java.util.Scanner;

public class Munja {

	public static void main(String[] args) {
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >>");
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		int c =s.charAt(0);
		
		int b=97; //�ƽ�Ű�ڵ� a
		
		for (;c>=b;c--) {
			for (;b<=c;b++) {
				System.out.print((char)b);
			}
			b=97;
			System.out.println();
		}
		
	}

}