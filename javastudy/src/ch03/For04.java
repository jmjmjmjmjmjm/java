package ch03;

public class For04 {

	public static void main(String[] args) {

		int n = 0;
		for (int i = 3; i < 100; i += 3) {
			n = n + i;
		}
		System.out.println(n);
	}
}