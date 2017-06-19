package pr5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private double first, second, third;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_THREE.getMess());

		while (true) {
			System.out.printf("%s", DialogMessages.FIRST_NUMBER.getMess());
			try {
				string = reader.readLine();
				first = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.FIRST_NUMBER.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.SECOND_NUMBER.getMess());
			try {
				string = reader.readLine();
				second = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.SECOND_NUMBER.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.THIRD_NUMBER.getMess());
			try {
				string = reader.readLine();
				third = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.THIRD_NUMBER.getMess());
			}
		}
		System.out.printf("%s %6.3f, %6.3f, %6.3f", DialogMessages.RESULT.getMess(), findResult(first),
				findResult(second), findResult(third));
	}

	private double findResult(double first) {
		double result;
		if (first >= 0) {
			result = Math.pow(first, 2);
		} else {
			result = Math.pow(first, 4);
		}
		return result;
	}
}
