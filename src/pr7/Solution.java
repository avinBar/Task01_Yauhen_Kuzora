package pr7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private double a, b, dx;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.INPUT_DATA.getMess());

		while (true) {
			System.out.printf("%s", DialogMessages.FIRST_A.getMess());
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.FIRST_A.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.SECOND_B.getMess());
			try {
				string = reader.readLine();
				b = Double.parseDouble(string);
				if (b < a) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.SECOND_B.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.DX.getMess());
			try {
				string = reader.readLine();
				dx = Double.parseDouble(string);
				if (dx > b - a && dx < 0) {
					continue;
				}
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.DX.getMess());
			}
		}
		findResult(a, b, dx);
	}

	private void findResult(double a, double b, double dx) {
		double result;
		double x = a;
		System.out.printf("|%3s%-7s%3s|%3s%-7s%3s|\n", " ", "x", " ", " ", "f(x)", " ");
		while (x < b) {
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			System.out.printf("|%3s%-7.3f%3s|%3s%-7.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}
		
		if (x-dx <= b) {
			x = b;
			result = (Math.sin(x) * Math.sin(x)) - Math.cos(2 * x);
			System.out.printf("|%3s%-7.3f%3s|%3s%-7.3f%3s|\n", " ", x, " ", " ", result, " ");
			x += dx;
		}
	}
}
