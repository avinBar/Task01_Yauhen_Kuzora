package pr10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private int n;
	double el;
	private double[][] mas1;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_DATA.getMess());
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_ARR1.getMess());
			try {
				string = reader.readLine();
				n = Integer.parseInt(string);
				if (n <= 0 | n % 2 != 0) {
					continue;
				}
				mas1 = new double[n][n];
				break;
			} catch (IOException | NumberFormatException e) {
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1.length; j++) {
				if (i % 2 == 0) {
					mas1[i][j] = j + 1;
				} else {
					mas1[i][j] = n - j;
				}
			}
		}
		System.out.printf("%s\n", DialogMessages.RESULT.getMess());
		
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1.length; j++) {
				System.out.printf("%4.0f ",mas1[i][j]);
			}
			System.out.println("");
		}

	}
}
