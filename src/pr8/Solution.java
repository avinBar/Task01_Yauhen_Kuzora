package pr8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n, k, el;
	private OneDimensionalArray array;
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

		array = new OneDimensionalArray(n);
		System.out.printf("%s", DialogMessages.INPUT_MAS.getMess());

		for (int i = 0; i < array.getArray().length; i++) {
			while (true) {
				System.out.printf("%s [%d]:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Integer.parseInt(string);
					if (el < 0) {
						continue;
					}
					array.getArray()[i] = el;
					break;
				} catch (IOException | NumberFormatException e) {
				}
			}
		}

		System.out.printf("%s %-7d\n", DialogMessages.RESULT.getMess(), array.findSum(k));
	}
}
