package ch03;

import java.util.Scanner;

public class Munja {

	public static void main(String[] args) {
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		Scanner scan = new Scanner(System.in);
		String s= scan.next();
		int c =s.charAt(0);
		
		int b=97; //아스키코드 a
		
		for (;c>=b;c--) {
			for (;b<=c;b++) {
				System.out.print((char)b);
			}
			b=97;
			System.out.println();
		}
		
	}

}
