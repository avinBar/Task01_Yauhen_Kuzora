package pr2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import pr2.DialogMessages;

class Solution {
	private double a, b, c, result;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_A.getMessage());
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				if (string.equals("0")) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.INPUT_A.getMessage());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_B.getMessage());
			try {
				string = reader.readLine();
				b = Double.parseDouble(string);
				if (string.equals("0")) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.INPUT_B.getMessage());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_C.getMessage());
			try {
				string = reader.readLine();
				c = Double.parseDouble(string);
				if (c < -b * b / (4 * a)) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.INPUT_C.getMessage());
			}
		}
		result = (b + Math.sqrt(b * b + 4 * a * c) / (2 * a)) - a * a * a * c + 1 / (b * b);
		System.out.printf("%s %6.3f", DialogMessages.RESULT.getMessage(), result);

	}
}
