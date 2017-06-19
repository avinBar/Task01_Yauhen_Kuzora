package pr3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pr3.DialogMessages;

class Solution {
	private double a, b;
	Triangle triangle;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_A.getMess());
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				if (a <= 0) {
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.INPUT_A.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_B.getMess());
			try {
				string = reader.readLine();
				b = Double.parseDouble(string);
				if (b <= 0) {
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.INPUT_B.getMess());
			}
		}
		triangle = new Triangle(a, b);
		System.out.printf("%7s %6.3f\n", DialogMessages.PERIMERT.getMess(), triangle.findPerim());
		System.out.printf("%7s %6.3f\n", DialogMessages.SQUARE.getMess(), triangle.findSquare());

	}
}