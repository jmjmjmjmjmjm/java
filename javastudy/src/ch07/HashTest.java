package ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HashTest {
	public static void main(String[] args) {
		// �������� ���ڸ� �������ִ� Ŭ����
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>();

		int n = 1;
		while (true) {
			int num = r.nextInt(45) + 1;
			System.out.println(num);

			if (lotto.size() < 1) {
				lotto.add(num);
			} else {

				if (lotto.size() > 0 && num != lotto.get(n - 1)) {
					n++;
					lotto.add(num);
				}
			}

			System.out.println("lotto Size : "+lotto.size());
			if (lotto.size() == 6) {
				break;
			}
		}

		Iterator<Integer> it = lotto.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " "); // ���� �ε����� ���� ����+�ε��� ����
		}

	}

}