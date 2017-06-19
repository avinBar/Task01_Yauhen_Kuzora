package pr9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n, m, k;
	double el;
	private OneDimensialArray mas1, mas2, mas3;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_DATA.getMess());
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_ARR1.getMess());
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (n <= 0) {
					continue;
				}
				mas1 = new OneDimensialArray(n);
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s", DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas1.getSize(); i++) {
			while (true) {
				System.out.printf("%s [%d]:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Double.parseDouble(string);
					mas1.getMas()[i] = el;
					break;
				} catch (IOException | NumberFormatException e) {
				}
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_ARR2.getMess());
			try {
				string = reader.readLine();
				m = Integer.parseInt(string);
				if (m <= 0) {
					continue;
				}
				mas2 = new OneDimensialArray(m);
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s", DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas2.getSize(); i++) {
			while (true) {
				System.out.printf("%s [%d]:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Double.parseDouble(string);
					mas2.getMas()[i] = el;
					break;
				} catch (IOException | NumberFormatException e) {
				}
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_K.getMess());
			try {
				string = reader.readLine();
				k = Integer.parseInt(string);
				if (k <= 0 || k > n) {
					continue;
				}
				mas3 = new OneDimensialArray(n + m);
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s\n", DialogMessages.RESULT.getMess());
		mas3 = mas3.arrayInArray2(mas1, mas2, k);
		System.out.printf("%s", mas3.printArray());
	}

}
