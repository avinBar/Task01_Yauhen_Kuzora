package pr8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n, k, el;
	private int[] mas;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_DATA.getMess());

		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_N.getMess());
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (n <= 0) {
					continue;
				}
				mas = new int[n];
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}

		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_K.getMess());
			try {
				string = reader.readLine();
				k = Integer.parseInt(string);
				if (k <= 0) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}

		System.out.printf("%s", DialogMessages.INPUT_MAS.getMess());
		for (int i = 0; i < mas.length; i++) {
			while (true) {
				System.out.printf("%s %d:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Integer.parseInt(string);
					if (el < 0) {
						continue;
					}
					mas[i] = el;
					break;
				} catch (IOException | NumberFormatException e) {
				}

			}
		}
		System.out.printf("%s %-7d\n", DialogMessages.RESULT.getMess(), findSum(mas, k));
	}

	private int findSum(int[] mas, int k) {
		int sum = 0;
		for (int i : mas) {
			if ((i % k) == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
