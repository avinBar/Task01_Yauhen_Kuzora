package pr4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private double x, y;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_X.getMess());
			try {
				string = reader.readLine();
				x = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.INPUT_X.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.INPUT_Y.getMess());
			try {
				string = reader.readLine();
				y = Double.parseDouble(string);
				break;
			} catch (IOException | NumberFormatException e) {
				System.out.printf("%s", DialogMessages.INPUT_Y.getMess());
			}
		}
		CartesianCoordinateSystem cs = new CartesianCoordinateSystem(x, y);
		System.out.printf("%s %s", DialogMessages.RESULT.getMess(), cs.checkArea());
	}
}