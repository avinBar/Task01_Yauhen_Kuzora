package pr9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n, m, k;
	double el;
	private double[] mas1, mas2, mas3;
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
				mas1 = new double[n];
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s", DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas1.length; i++) {
			while (true) {
				System.out.printf("%s [%d]:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Double.parseDouble(string);
					mas1[i] = el;
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
				mas2 = new double[m];
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s", DialogMessages.INPUT_ELN.getMess());
		for (int i = 0; i < mas2.length; i++) {
			while (true) {
				System.out.printf("%s [%d]:", DialogMessages.INPUT_EL.getMess(), i);
				try {
					string = reader.readLine();
					el = Double.parseDouble(string);
					mas2[i] = el;
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
				mas3 = new double[n + m];
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		System.out.printf("%s\n", DialogMessages.RESULT.getMess());
		arrayInArray2(mas1, mas2, k);
		for (double d : mas3) {
			System.out.printf("%-6.3f\n", d);
		}
	}

	private double[] arrayInArray2(double[] mas1, double[] mas2, int k) {
		for (int i = 0; i < mas1.length; i++) {
			mas3[i] = mas1[i];
		}
		for (int i = 0; i < mas1.length; i++) {
			if (i >= k) {
				mas3[i + m] = mas3[i];
			}
		}
		for (int i = 0; i < mas2.length; i++) {
			mas3[k + i] = mas2[i];
		}
		return mas3;
	}
}
