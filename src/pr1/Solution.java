package pr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution {
	private Checker checker = new Checker();
	private String fourDNumber;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	void start() {
		System.out.printf("%s", DialogMessages.InputFourDigitNumber.getMess());
		while (true) {
			try {
				fourDNumber = reader.readLine();
				if (checker.isFourDigitNumber(fourDNumber) | fourDNumber.equals("q")) {
					reader.close();
					break;
				} else {
					System.out.printf("%s", DialogMessages.NotFourDigitNumber.getMess());
				}
			} catch (IOException e) {
				System.out.printf("%s", DialogMessages.InputFourDigitNumber.getMess());
			}
		}
		if (fourDNumber.equals("q")) {
			System.out.printf("%s", DialogMessages.End.getMess());
		} else {
			System.out.printf("%s %s\n", DialogMessages.Number.getMess(), fourDNumber);
			System.out.printf("%s %s\n", DialogMessages.Result.getMess(), isTrue(parseToInt(fourDNumber)));
			System.out.printf("%s", DialogMessages.End.getMess());
		}

	}

	private char[] parseToInt(String fourDNumber) {
		char[] chars = fourDNumber.toCharArray();
		return chars;
	}

	private boolean isTrue(char[] chars) {
		int a, b, c, d;
		a = Integer.parseInt(chars[0] + "");
		b = Integer.parseInt(chars[1] + "");
		c = Integer.parseInt(chars[2] + "");
		d = Integer.parseInt(chars[3] + "");
		if (a + b == c + d) {
			return true;
		}
		return false;
	}

}
