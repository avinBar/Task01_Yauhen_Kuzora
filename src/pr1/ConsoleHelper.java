package pr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
	public String input4DNumber(Checker checker) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String fourDNumber;
		System.out.printf("%s", DialogMessages.INPUT_FOUR_DIGIT_NUMBER.getMess());
		while (true) {
			try {
				fourDNumber = reader.readLine();
				if (checker.isFourDigitNumber(fourDNumber) | fourDNumber.equals("q")) {
					reader.close();
					break;
				} else {
					System.out.printf("%s", DialogMessages.NOT_FOUR_DIGIT_NUMBER.getMess());
				}
			} catch (IOException e) {
				System.out.printf("%s", DialogMessages.INPUT_FOUR_DIGIT_NUMBER.getMess());
			}
		}
		return fourDNumber;
	}

	public void printResults(String fourDNumber, boolean result) {
		if (fourDNumber.equals("q")) {
			System.out.printf("%s", DialogMessages.END.getMess());
		} else {
			System.out.printf("%s %s\n", DialogMessages.NUMBER.getMess(), fourDNumber);
			System.out.printf("%s %s\n", DialogMessages.RESULT.getMess(), result);
			System.out.printf("%s", DialogMessages.END.getMess());
		}
	}
}
