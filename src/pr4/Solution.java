package pr4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	private double x, y;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		while (true) {
			System.out.printf("%s", DialogMessages.InputX.getMess());
			try {
				string = reader.readLine();
				x = Double.parseDouble(string);
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.InputX.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.InputY.getMess());
			try {
				string = reader.readLine();
				y = Double.parseDouble(string);
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.InputY.getMess());
			}
		}
		System.out.printf("%s %s", DialogMessages.Result.getMess(), checkArea(x, y));
	}

	boolean checkArea(double x, double y) {
		if (y >= -4 & y <= 0) {
			if (x >= -4 & x <= 4) {
				return true;
			}
		} else if (y >= 0 & y <= 4) {
			if (x >= -2 & x <= 2) {
				return true;
			}
		}
		return false;
	}
}