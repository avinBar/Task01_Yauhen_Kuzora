package pr3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pr3.DialogMessages;

class Solution {
	private double a, b, c, S, P;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		String string;
		while (true) {
			System.out.printf("%s", DialogMessages.InputA.getMess());
			try {
				string = reader.readLine();
				a = Double.parseDouble(string);
				if (a <= 0) {
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.InputA.getMess());
			}
		}
		while (true) {
			System.out.printf("%s", DialogMessages.InputB.getMess());
			try {
				string = reader.readLine();
				b = Double.parseDouble(string);
				if (b <= 0) {
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.printf("%s", DialogMessages.InputB.getMess());
			}
		}
		c = Math.sqrt(a * a + b * b);
		P = a + b + c;
		S = a*b/2;
		System.out.printf("%7s %6.3f\n", DialogMessages.Perimetr.getMess(), P);
		System.out.printf("%7s %6.3f\n", DialogMessages.Square.getMess(), S);

	}
}