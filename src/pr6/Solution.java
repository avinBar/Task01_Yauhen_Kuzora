package pr6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private double first, second, third;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		System.out.printf("%s", DialogMessages.InputThree.getMess());

		while (true) {
			System.out.printf("%s", DialogMessages.FirstNumber.getMess());
			try {
				string = reader.readLine();
				first = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.FirstNumber.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.SecondNumber.getMess());
			try {
				string = reader.readLine();
				second = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.SecondNumber.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.ThirdNumber.getMess());
			try {
				string = reader.readLine();
				third = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.ThirdNumber.getMess());
			}
		}
		System.out.printf("%s %6.3f", DialogMessages.Result.getMess(), findResult(first, second, third));

	}

	private double findResult(double first, double second, double third) {
		double result;
		double min = first;
		double max = first;
		if (second >= max) {
			max = second;
		} 
		if (third >= max) {
			max = third;
		}
		if (second <= min) {
			min = second;
		}
		if (third <= min) {
			min = third;
		}
		result = max + min;
		return result;
	}
}
